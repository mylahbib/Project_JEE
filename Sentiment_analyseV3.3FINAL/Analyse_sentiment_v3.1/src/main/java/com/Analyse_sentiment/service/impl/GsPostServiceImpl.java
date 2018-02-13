package com.Analyse_sentiment.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.dao.PostDao;
import com.Analyse_sentiment.dao.UserDao;
import com.Analyse_sentiment.service.PostService;
@Service
@Transactional
public class GsPostServiceImpl implements PostService{
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private UserDao userDao;
	
	public GsPostServiceImpl() {
	
	}
	

	public void addPost(Post p) {
		
		postDao.create(p);
		
	}

	public void deletePost(Long id) {
		postDao.delete(id);
		
	}

	public List<Post> getAllPost() {
		
		return postDao.getAll();
	}

	public void updatPost(Post p) {
		
		postDao.update(p);
		
	}

	public List<Post> findUserPosts(String nomUsr) {
		
		return null;
	}



	public Post getPostByiId(Long id) {
	Post post	= postDao.findById(id);
		return post;
	}

	public double CalculateRating(String comments) {
			
			double rating = postDao.CalculateRating(comments);
			
			return rating;
		}


	public void updatePost(Post post) {
		postDao.update(post);
		
	}

	
	


}
