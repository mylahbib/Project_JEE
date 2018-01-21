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
	private Date record_date;
	
	@OneToMany(mappedBy="user" ,fetch=FetchType.LAZY)
	private Collection<Post> posts ;

	
	
	
	
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
		this.record_date = record_date;
		this.posts = posts;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	public void setPosts(Collection<Post> posts) {
		this.posts = posts;
	}
	
	
	
	
	

}
