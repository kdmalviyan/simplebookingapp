package com.kd.simplebookingapp.sevices;

import com.kd.simplebookingapp.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User save(User user);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long accountId);
}
