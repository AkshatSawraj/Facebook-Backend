package com.example.facebookapi.Model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Status {
	@Id
	private UUID statusId;
	private UUID userID;
	private String statusImageURL;
	private Date dateTime;
	
	
	public Status(UUID statusId, UUID userID, String statusImageURL, Date dateTime) {
		super();
		this.statusId = statusId;
		this.userID = userID;
		this.statusImageURL = statusImageURL;
		this.dateTime = dateTime;
	}
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getStatusId() {
		return statusId;
	}
	public void setStatusId(UUID statusId) {
		this.statusId = statusId;
	}
	public UUID getUserID() {
		return userID;
	}
	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	public String getStatusImageURL() {
		return statusImageURL;
	}
	public void setStatusImageURL(String statusImageURL) {
		this.statusImageURL = statusImageURL;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
