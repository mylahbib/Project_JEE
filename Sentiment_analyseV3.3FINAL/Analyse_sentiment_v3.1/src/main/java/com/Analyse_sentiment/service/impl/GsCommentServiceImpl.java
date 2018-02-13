package com.Analyse_sentiment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Analyse_sentiment.bo.Comment;
import com.Analyse_sentiment.dao.CommentDao;
import com.Analyse_sentiment.dao.UserDao;
import com.Analyse_sentiment.service.CommentService;
@Service
@Transactional
public class GsCommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao commentDao;
	
	@Autowired
	private UserDao userDao;
	
	public GsCommentServiceImpl() {
	
	}
	

	public void addComment(Comment p) {
		
		commentDao.create(p);
		
	}

	public void deleteComment(Long id) {
		commentDao.delete(id);
	
	}

	public List<Comment> getAllComment() {
		
		return commentDao.getAll();
	}

	public void updateComment(Comment p) {
		
		commentDao.update(p);
		
	}

	

	

	
	


}
