package com.Analyse_sentiment.service.impl;

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

	System.out.println("GsPostServiceImpl");
	
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

	

	
	


}
