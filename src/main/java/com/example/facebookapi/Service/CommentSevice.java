package com.example.facebookapi.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Model.Comment;
import com.example.facebookapi.Repository.CommentRepository;

@Service
public class CommentSevice {

	@Autowired
	CommentRepository commentRepo;
	
	
	
	public Comment submitComment(Comment comment) {
		comment.setCommentID(UUID.randomUUID());
		comment.setDateTime(new Date());
		return commentRepo.save(comment);
		
	}
	
	public ArrayList<Comment> getAllComments(UUID postID){
		return commentRepo.findAllByPostID(postID);
	}
	
	public ArrayList<Comment> deleteComment(UUID id,UUID pid){
		commentRepo.deleteById(id);
		return getAllComments(pid);
	}
	
}
