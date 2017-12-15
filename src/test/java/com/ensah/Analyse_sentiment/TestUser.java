package com.ensah.Analyse_sentiment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.dao.UserDao;
import com.Analyse_sentiment.dao.impl.UserDaoImpl;
import com.analyse_sentiment.appConfig.AppConfig;

import junit.framework.TestCase;

public class TestUser  {
	public static void main(String[] args) {
		ApplicationContext springcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserDaoImpl userdao= springcontext.getBean(UserDaoImpl.class);
		User o = new User("youssef","mylahbib");
		userdao.create(o);
	
		
	} 
		
	

}
