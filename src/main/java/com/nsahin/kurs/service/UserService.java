package com.nsahin.kurs.service;
import com.nsahin.kurs.model.User;
import java.util.List;

public interface UserService {
    User addUser(User user);
    void deleteUser(Long userId);
    User updateUser(User user);
    User getUser(Long userId);
    List<User> getAllUsers();
    
    
}
