package com.Analyse_sentiment.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;



import com.Analyse_sentiment.bo.Post;


public interface PostService {
	
	void addPost(Post p);
	
	void deletePost(Long id);
	
	List<Post> getAllPost();
	
	void updatPost(Post p);
	
	List<Post> findUserPosts(String nomUsr);
	
	Post getPostByiId(Long id);
	
	double CalculateRating(String comments);
	
	public void updatePost(Post post) ;

}
