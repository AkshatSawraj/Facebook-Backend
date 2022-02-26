package com.example.facebookapi.Repository;

import org.springframework.stereotype.Repository;
import com.example.facebookapi.Model.User;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface UserRepository extends MongoRepository<User,String>{
	
	User save(User user);
	ArrayList<User> findAll();
	User findAllByUserID(String UserID);
	@Override
	void deleteById(String id) ;
		
		
	
	
	
}
