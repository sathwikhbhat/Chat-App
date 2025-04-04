package com.sathwikhbhat.chatapp.service;

import com.sathwikhbhat.chatapp.model.User;
import com.sathwikhbhat.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password))
            return user;
        return null;
    }
}
