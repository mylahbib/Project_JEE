package com.Analyse_sentiment.service;

import java.util.List;
import com.Analyse_sentiment.bo.User;


public interface UserService {
	

		public void addUser(User pUser);

		public List<User> getAllUsers();

		public void updateUser(User pUser);

		public User getUserById(Long id);

	}


