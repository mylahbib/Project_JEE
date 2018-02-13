package com.Analyse_sentiment.dao;


import com.Analyse_sentiment.bo.Post;
import com.genericdao.api.GenericDao;

public interface PostDao extends GenericDao<Post,Long>{

	public double CalculateRating(String c);
}
