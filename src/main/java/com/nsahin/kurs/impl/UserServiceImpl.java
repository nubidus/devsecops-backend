package com.nsahin.kurs.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nsahin.kurs.model.*;
import com.nsahin.kurs.repository.*;
import com.nsahin.kurs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	 
	@Autowired
    private UserRepository userRepository;

   
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Diğer metotlar...

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}
}