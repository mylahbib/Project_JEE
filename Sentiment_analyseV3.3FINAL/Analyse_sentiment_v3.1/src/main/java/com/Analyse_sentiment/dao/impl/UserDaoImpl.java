package com.Analyse_sentiment.dao.impl;

import java.sql.DriverManager;

import org.springframework.stereotype.Repository;

import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.dao.UserDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@Repository
public class UserDaoImpl extends HibernateSpringGenericDaoImpl<User, Long> implements UserDao {
	


	public UserDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
