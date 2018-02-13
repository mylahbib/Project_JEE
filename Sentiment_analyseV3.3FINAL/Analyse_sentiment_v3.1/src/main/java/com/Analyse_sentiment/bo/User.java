package com.Analyse_sentiment.bo;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String nom;
	@Column(length=50)
	private String prenom;
	@Column(length=50)
	private String email;
	@Column(length=50)

	private String password;
	

	@Column(length=50)
	private Date record_date;
	
	@OneToMany(mappedBy="user" ,fetch=FetchType.LAZY)
	private Collection<Post> posts ;
	
	@OneToMany(mappedBy="user" ,fetch=FetchType.LAZY)
	private Collection<Comment> comments ;

	
	
	
	
	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public User() {
		super();
		
	}

	public User(String nom, String prenom, String email, Date record_date, Collection<Post> posts) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		//this.record_date = record_date;
		this.posts = posts;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}
	public User(String nom, String prenom, String email, String password, Date record_date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.record_date = record_date;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Date getRecord_date() {
//		return record_date;
//	}
//
//	public void setRecord_date(Date record_date) {
//		this.record_date = record_date;
//	}

	
	
	
	public Collection<Post> getPosts() {
		return posts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPosts(Collection<Post> posts) {
		this.posts = posts;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	
	

}
