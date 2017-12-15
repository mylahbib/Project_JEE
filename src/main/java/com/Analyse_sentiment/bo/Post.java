package com.Analyse_sentiment.bo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idPost;
	private String description;
	private String urlImg;
	private Date created_date;
	private Double rating;
	@ManyToOne
	@JoinColumn(name="ID_USR")
	private User user;
	
	@OneToMany(mappedBy="post" ,fetch=FetchType.LAZY)
	private Collection<Comment> comments;
	
	
	
	

	public Post() {
		super();
		
	}

	public Post(String description, String urlImg, Date created_date, Double rating, User user,
			Collection<Comment> comments) {
		super();
		this.description = description;
		this.urlImg = urlImg;
		this.created_date = created_date;
		this.rating = rating;
		this.user = user;
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	
	
	

}
