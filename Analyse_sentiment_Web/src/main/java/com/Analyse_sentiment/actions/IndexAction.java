package com.Analyse_sentiment.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.service.PostService;
@SuppressWarnings("serial")
@ResultPath("/pages/")
@Result(name="success" ,location="index.jsp")
public class IndexAction extends BaseAction{
	private List<Post> posts;
	
	@Autowired
	private PostService postService;
public String index() {
	
	 setPosts(postService.getAllPost());
	return SUCCESS;
}
public List<Post> getPosts() {
	return posts;
}
public void setPosts(List<Post> posts) {
	this.posts = posts;
}
}
