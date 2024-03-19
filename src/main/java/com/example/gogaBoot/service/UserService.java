package com.example.gogaBoot.service;

import com.example.gogaBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void removeUser(long id);
}
