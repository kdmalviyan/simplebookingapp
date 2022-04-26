package com.kd.simplebookingapp.sevices;

import com.kd.simplebookingapp.dtos.BookingRequestPayload;
import com.kd.simplebookingapp.entities.Booking;
import com.kd.simplebookingapp.entities.User;
import com.kd.simplebookingapp.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = BookingServiceImpl.BEAN_NAME)
public class BookingServiceImpl implements BookingService {
    public static final String BEAN_NAME = "BookingService";
    private final BookingRepository bookingRepository;
    private final UserService userService;

    public BookingServiceImpl(final BookingRepository bookingRepository,
                              final UserService userService) {
        this.bookingRepository = bookingRepository;
        this.userService = userService;
    }

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> findByUserId(Long userId) {
        User user = userService.findById(userId).orElse(null);
        return bookingRepository.findByUser(user);
    }

    @Override
    public void makeABooking(BookingRequestPayload requestPayload) {
        Booking booking = new Booking();
        booking.setBookingDate(requestPayload.getBookingTime());
        booking.setUser(requestPayload.getUser());
        save(booking);
    }
}
