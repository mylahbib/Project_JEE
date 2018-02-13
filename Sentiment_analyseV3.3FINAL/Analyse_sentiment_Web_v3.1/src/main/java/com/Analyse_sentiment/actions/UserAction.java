package com.Analyse_sentiment.actions;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.dao.UserDao;
import com.Analyse_sentiment.service.PostService;
import com.Analyse_sentiment.service.UserService;
import com.Analyse_sentiment.service.impl.GsPostServiceImpl;
import com.Analyse_sentiment.service.impl.GsUserServiceImpl;

@ResultPath("/pages/")

public class UserAction extends BaseAction implements SessionAware{

	private static final long serialVersionUID = 1L;



	@Autowired
	private UserService userService;
	
	@Autowired
	private ServletContext servletContext;
	
	private List<User> listUser ;
	private User user;
	 private  String nom,password,email,prenom;  
	 private String msg;	//a message to display in case login is failed
	 private SessionMap<String,Object> sessionMap;  // session to store variables
	 
	
	
	
		
	public UserAction() {
		
	}
	@Action(value="showUserForm", results = { @Result( name = "success" , location = "/pages/addUserForm.jsp")     
			
	    },  interceptorRefs={
		        
			        @InterceptorRef("defaultStack"),
			        @InterceptorRef("validation")
		    })
public String showUserForm() {
		
		return SUCCESS;
		
		
	}
	
	@Action(value="addUser", results = { @Result(type="redirectAction", location = "showUserForm", name = "success" ) })
	public String addUser() {
		
		
		new Timer( true );
		user.setRecord_date( new Date());
		userService.addUser(user);
		return SUCCESS;	
	}
	

	
	/*
	 * Authentification
	 */
	
	@Action(value="loginAction", results = { 
			@Result( name = "success", location = "index.jsp" ), //if the login is succecefull
			@Result( name = "error", location = "login.jsp" )})	//if the login failed
	public String login() {
		System.out.println("******************************************************");
		
		listUser = userService.getAllUsers();
		//will will loop throw all users in the database
		for(User u:listUser) {
			//we check if some user in db has the same username and password entrted
			if(user.getEmail().equals(u.getEmail())&& user.getPassword().equals(u.getPassword())) {
				
				sessionMap.put("login","true");  
			    sessionMap.put("loggedUser",u);  

				return SUCCESS;
			}		
		}
		//if we are here, it means no use has the entered username and password..
		
			msg = "Uncorrect username or password, Try again...";
			return ERROR;
		
	}
	
	
	

	
	
	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = (GsUserServiceImpl) userService;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	 public String getMsg() {
	        return msg;
	    }

	 public void setMsg(String msg) {
	     this.msg = msg;
	 }
	
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map;  
		
	}
	 
	 
		
	

	
	

	
	
}
