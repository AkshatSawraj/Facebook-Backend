package com.example.facebookapi.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Model.Post;
import com.example.facebookapi.Repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepo;

	public ArrayList<Post> submitPostToDB(Post postData) {
		
		Date date=new Date();
		
		
		postData.setPostID(UUID.randomUUID());
		postData.setLikes(0);
		postData.setDateTime(date);
		
		postRepo.save(postData);
		ArrayList<Post> resultList = retrivePostFromDB();
		return resultList;
	}

	public ArrayList<Post> retrivePostFromDB() {
		ArrayList<Post> resultList =postRepo.findAll();
		return resultList;
	}

	public ArrayList<Post> deletePostFromDB(UUID id) {
		postRepo.deleteById(id);
		ArrayList<Post> resultList = retrivePostFromDB();
		return resultList;
	}

}
