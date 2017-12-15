package com.Analyse_sentiment.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCom; 
	private String content;
	private double rating_com; 
	@ManyToOne
	@JoinColumn(name="ID_POST")
	private Post post ;
	
	
	
	public Comment() {
		
	}
	public Comment(String content, double rating_com, Post post) {
		super();
		this.content = content;
		this.rating_com = rating_com;
		this.post = post;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getRating_com() {
		return rating_com;
	}
	public void setRating_com(double rating_com) {
		this.rating_com = rating_com;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	


}
