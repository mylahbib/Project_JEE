package com.Analyse_sentiment.dao.impl;

import org.springframework.stereotype.Repository;

import com.Analyse_sentiment.bo.Comment;
import com.Analyse_sentiment.dao.CommentDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class CommentDaoImpl extends HibernateSpringGenericDaoImpl<Comment, Long> implements CommentDao{

	public CommentDaoImpl() {
		super(Comment.class);
		
	}

}
