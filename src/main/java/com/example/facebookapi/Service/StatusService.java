package com.example.facebookapi.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Model.Status;
import com.example.facebookapi.Repository.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	StatusRepository statusRepo;

	public Status submitStatus(Status status) {
		
		status.setStatusId(UUID.randomUUID());
		status.setDateTime(new Date());

		return statusRepo.save(status);
	}
	
	public ArrayList<Status> getAllStatus(){
	
		
		return statusRepo.findAll();
	}
	
	public ArrayList <Status> deleteStatus(UUID id){
		statusRepo.deleteById(id);
		return getAllStatus();
	}
}
