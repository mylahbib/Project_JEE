package com.Analyse_sentiment.dao;

import org.springframework.stereotype.Repository;

import com.Analyse_sentiment.bo.Comment;
import com.genericdao.api.GenericDao;
@Repository
public interface CommentDao extends GenericDao<Comment,Long>{
	
	

}
