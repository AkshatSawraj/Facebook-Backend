package com.example.facebookapi.Model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {

	@Id
	private UUID commentID;
	
	private UUID postID;
	private UUID userID;
	
	private String comment;
	private Date dateTime;
	public Comment(UUID commentID, UUID postID, UUID userID, String comment, Date dateTime) {
		super();
		this.commentID = commentID;
		this.postID = postID;
		this.userID = userID;
		this.comment = comment;
		this.dateTime = dateTime;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getCommentID() {
		return commentID;
	}
	public void setCommentID(UUID commentID) {
		this.commentID = commentID;
	}
	public UUID getPostID() {
		return postID;
	}
	public void setPostID(UUID postID) {
		this.postID = postID;
	}
	public UUID getUserID() {
		return userID;
	}
	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
