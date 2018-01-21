package com.Analyse_sentiment.service;

import java.util.List;



import com.Analyse_sentiment.bo.Post;

public interface PostService {
	
	void addPost(Post p);
	
	void deletePost(Long id);
	
	List<Post> getAllPost();
	
	void updatPost(Post p);
	
	List<Post> findUserPosts(String nomUsr);
	

}
