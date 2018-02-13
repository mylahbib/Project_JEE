package com.Analyse_sentiment.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.service.PostService;
@SuppressWarnings("serial")
@ResultPath("/pages/")


public class IndexAction extends BaseAction implements SessionAware{
	
	private List<Post> posts;
	private SessionMap<String,Object> sessionMap;  
	
	
	
	@Autowired
	private PostService postService;
	
	
	/*
	 * Verify if the user logged in, before redirect to /index
	 */
	
	@Action(value="/index", results = { 
			@Result(name="success" ,location="index.jsp"),
			@Result(name="login" ,location="login.jsp")})
	
	 public String isLogged(){  
        HttpSession session=ServletActionContext.getRequest().getSession(false);  
        if(session==null || session.getAttribute("login")==null){  
            return "login";  
        }  
        else{  
        	
        	setPosts(postService.getAllPost());
            return "SUCCESS";  
       }  
	}
		
		
		
		
		
			
			

	
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		   sessionMap=(SessionMap)map; 
	
	}
}
