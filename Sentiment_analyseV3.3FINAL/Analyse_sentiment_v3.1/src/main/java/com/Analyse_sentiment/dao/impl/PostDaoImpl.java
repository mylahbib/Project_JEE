package com.Analyse_sentiment.dao.impl;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import com.Analyse_sentiment.algorithmes.getCommentsValue;
import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.dao.PostDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

@Repository
public class PostDaoImpl extends HibernateSpringGenericDaoImpl<Post, Long> implements PostDao{

	public PostDaoImpl() {
		super(Post.class);
			}
	
public double CalculateRating(String comments) {
		
		String polarityTable = "C:\\words.csv";
	
		double x = getCommentsValue.getCommentsRating(comments, polarityTable);
		return x;
	}

}
