package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.facebookapi.Model.Status;

public interface StatusRepository extends MongoRepository<Status, UUID>{

	@Override
	Status save(Status entity) ;

	@Override
	void deleteById(UUID id) ;

	@Override
	ArrayList<Status> findAll() ;

	
}
