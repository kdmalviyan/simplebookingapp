package com.kd.simplebookingapp.sevices;

import com.kd.simplebookingapp.dtos.BookingRequestPayload;
import com.kd.simplebookingapp.entities.User;
import com.kd.simplebookingapp.repositories.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;

import static org.mockito.Mockito.*;

@SpringBootTest
public class BookingServiceTest {
    final UserService userService = mock(UserService.class);
    final BookingRepository bookingRepository = mock(BookingRepository.class);

    @Test
    public void testMakePayment() {
        BookingService bookingService = new BookingServiceImpl(bookingRepository, userService);
        User user = createUser("kdmalviyan@gmail.com", "Kuldeep Singh");
        BookingRequestPayload requestPayload = createRequestPayload(user, LocalDateTime.now());
        bookingService.makeABooking(requestPayload);
    }

    private BookingRequestPayload createRequestPayload(User user, LocalDateTime localDateTime) {
        BookingRequestPayload requestPayload = new BookingRequestPayload();
        requestPayload.setUser(user);
        requestPayload.setBookingTime(localDateTime);
        return requestPayload;
    }

    private User createUser(String email, String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return user;
    }
}
