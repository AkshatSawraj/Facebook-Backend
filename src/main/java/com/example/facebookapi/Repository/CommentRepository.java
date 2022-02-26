package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.facebookapi.Model.Comment;



public interface CommentRepository extends MongoRepository<Comment, UUID>{

	@Override
	Comment save(Comment entity) ;

	@Override
	void deleteById(UUID id) ;

	@Query
	ArrayList<Comment> findAllByPostID(UUID id) ;
}
