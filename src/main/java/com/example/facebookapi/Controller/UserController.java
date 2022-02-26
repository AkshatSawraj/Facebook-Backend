package com.example.facebookapi.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.facebookapi.Model.User;
import com.example.facebookapi.Service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/userService")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User body) {
		User user= userService.submitUser(body);
		return user;
	}

	@GetMapping("/getAllUsers")
	public ArrayList<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUser/{user}")
	public User getUser(@PathVariable("user") String userID) {
		return userService.getUserData(userID);
	}
	
	@DeleteMapping("/deleteUser/{user}")
	public ArrayList<User> deleteUser(@PathVariable("user") String userID){
		return  userService.deleteUserFromDB(userID);
		
	}

}
