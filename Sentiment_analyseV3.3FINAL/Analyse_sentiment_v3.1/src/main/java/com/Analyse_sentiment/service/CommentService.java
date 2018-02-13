package com.Analyse_sentiment.service;

import java.util.List;

import com.Analyse_sentiment.bo.Comment;

public interface CommentService {
	
	void addComment(Comment p);
	
	void deleteComment(Long id);
	
	List<Comment> getAllComment();
	
	void updateComment(Comment p);
	
	
	

}
