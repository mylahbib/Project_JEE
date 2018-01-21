package com.Analyse_sentiment.dao.impl;

import org.springframework.stereotype.Repository;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.dao.PostDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

@Repository
public class PostDaoImpl extends HibernateSpringGenericDaoImpl<Post, Long> implements PostDao{

	public PostDaoImpl() {
		super(Post.class);
			}

}
