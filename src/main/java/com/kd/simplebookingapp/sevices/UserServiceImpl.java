package com.kd.simplebookingapp.sevices;

import com.kd.simplebookingapp.entities.User;
import com.kd.simplebookingapp.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(UserServiceImpl.BEAN_NAME)
public class UserServiceImpl implements UserService {
    public static final String BEAN_NAME = "AccountService";
    private final UserRepository userRepository;
    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(Long accountId) {
        return userRepository.findById(accountId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
