package com.Analyse_sentiment.dao.impl;

import com.Analyse_sentiment.bo.Post;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

public class PostDaoImpl extends HibernateSpringGenericDaoImpl<Post, Long> {

	public PostDaoImpl() {
		super(Post.class);
		// TODO Auto-generated constructor stub
	}

}
