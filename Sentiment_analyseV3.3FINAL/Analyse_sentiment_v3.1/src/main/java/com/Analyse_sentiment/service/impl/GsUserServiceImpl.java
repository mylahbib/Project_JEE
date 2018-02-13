package com.Analyse_sentiment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.dao.UserDao;
import com.Analyse_sentiment.service.UserService;

@Service
@Transactional
public class GsUserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDao userDao;

	public void addUser(User pUser) {
		userDao.create(pUser);		
	}

	public List<User> getAllUsers() {
		
		return userDao.getAll();

	}

	public void updateUser(User pUser) {

		userDao.update(pUser);

	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}








}
