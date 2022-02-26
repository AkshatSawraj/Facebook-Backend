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

import com.example.facebookapi.Model.Comment;
import com.example.facebookapi.Model.Status;
import com.example.facebookapi.Service.CommentSevice;


@CrossOrigin
@RestController
@RequestMapping("api/commentService")
public class CommentController {
	
	@Autowired
	CommentSevice commentService;
	
	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment body) {
		return commentService.submitComment(body);
		
	}
	
	@GetMapping("/getAllComments/{postID}")
	public ArrayList<Comment> getAllComments(@PathVariable("postID") UUID postID){
		return commentService.getAllComments(postID);
	}
	
	@DeleteMapping("/delete/{commentID}/{postID}")
	public ArrayList<Comment> deleteComment(@PathVariable("commentID") UUID id, @PathVariable("postID") UUID pid){
		return commentService.deleteComment(id,pid);
	}
	
}
