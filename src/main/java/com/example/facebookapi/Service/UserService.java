package com.example.facebookapi.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Model.User;
import com.example.facebookapi.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public User submitUser(User user) {

//		user.setUserID(UUID.randomUUID());
		user.setActivityStatus(true);
		user.setJoinedDate(new Date());
		return userRepo.save(user);

	}

	public ArrayList<User> getAllUsers() {

		return userRepo.findAll();

	}

	public User getUserData(String userID) {
		return userRepo.findAllByUserID(userID);
	}
	public ArrayList<User> deleteUserFromDB(String userId){
		userRepo.deleteById(userId);
		return getAllUsers();
	}
}
