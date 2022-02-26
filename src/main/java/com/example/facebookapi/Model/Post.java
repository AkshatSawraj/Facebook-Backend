package com.example.facebookapi.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Posts")
public class Post {
	@Id
	private UUID postID;
	private UUID userID;
	private String username;
	private String imageURL;

	private String description;
	private String postImgURL;

	private int likes;
	private Date dateTime;

	public Post() {
		super();

	}

	public Post(UUID postID, UUID userID, String username, String imageURL, String description, String postImgURL,
			int likes, Date dateTime) {

		this.postID = postID;
		this.userID = userID;
		this.username = username;
		this.imageURL = imageURL;
		this.description = description;
		this.postImgURL = postImgURL;
		this.likes = likes;
		this.dateTime = dateTime;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostImgURL() {
		return postImgURL;
	}

	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}
