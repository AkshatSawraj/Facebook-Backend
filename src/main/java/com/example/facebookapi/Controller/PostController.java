package com.example.facebookapi.Controller;
import com.example.facebookapi.Model.Post;
import com.example.facebookapi.Service.PostService;

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

@CrossOrigin
@RestController
@RequestMapping("/api/postService")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@PostMapping("/save")
	public ArrayList<Post> submitPost(@RequestBody Post body){
		ArrayList<Post> resultList = postService.submitPostToDB(body);
		return resultList;
	}
	
	@GetMapping("/getPost")
	public ArrayList<Post> retrieveAllPost(){
		ArrayList<Post> resultList = postService.retrivePostFromDB();
		return resultList;
	}
	
	@DeleteMapping("/delete/{postId}")
	public ArrayList<Post> deleteParticularPost(@PathVariable("postId") UUID postId){
		ArrayList<Post> resultList =postService.deletePostFromDB(postId);
		return resultList;
	}
	
	
	
}
