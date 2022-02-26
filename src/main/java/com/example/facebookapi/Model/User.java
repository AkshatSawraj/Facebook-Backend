package com.example.facebookapi.Model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
	private String userID;
	private String userName;
	private String userImageURL;
	private boolean activityStatus;
	private Date joinedDate;
	public User(String userID, String userName, String userImageURL, boolean activityStatus, Date joinedDate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userImageURL = userImageURL;
		this.activityStatus = activityStatus;
		this.joinedDate = joinedDate;
	}
	public User() {
		super();
		
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImageURL() {
		return userImageURL;
	}
	public void setUserImageURL(String userImageURL) {
		this.userImageURL = userImageURL;
	}
	public boolean isActivityStatus() {
		return activityStatus;
	}
	public void setActivityStatus(boolean activityStatus) {
		this.activityStatus = activityStatus;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	
	
}
