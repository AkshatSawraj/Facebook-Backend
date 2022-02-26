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

import com.example.facebookapi.Model.Status;
import com.example.facebookapi.Service.StatusService;

@CrossOrigin
@RestController
@RequestMapping("api/statusService")
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("/save")
	public Status saveStatus(@RequestBody Status body) {
		Status stat=statusService.submitStatus(body);
		return stat;
	}
	
	@GetMapping("/getAllStatus")
	public ArrayList<Status> getAllStatus(){
		return statusService.getAllStatus();
	}
	
	@DeleteMapping("/deleteStatus/{statusId}")
	public ArrayList<Status> deleteStatus(@PathVariable("statusId") UUID id){
		return statusService.deleteStatus(id);
	} 
}
