package com.Analyse_sentiment.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.Analyse_sentiment.bo.Comment;
import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.service.CommentService;
import com.Analyse_sentiment.service.PostService;
import com.lowagie.tools.split_pdf;
@ResultPath("/pages/")
public class CommentAction extends BaseAction implements SessionAware{
		 
	@Autowired
	private  CommentService commentService;
	@Autowired
	private  PostService postService;
	private  Post post ;
	private List<Post> listPost;
	private List<Comment> listComments;
	private Comment  comment ;
	
	private Long idpost;
	
	private User loggedUser;
	private SessionMap<String,Object> sessionMap;  
	
	public User getLoggedUser() {
		
		loggedUser = (User) sessionMap.get("loggedUser");
		
		return loggedUser;
	}

	



	public Long getIdpost() {
		return idpost;
	}



	public void setIdpost(Long idpost) {
		this.idpost = idpost;
	}



	public void Comment() {
		if (getSession().getAttribute("listPost") == null) {
			 List<Long> listidPost = new ArrayList<Long>();
			 
			 listPost=postService.getAllPost();
			 listComments= commentService.getAllComment();
			 
			 for (Post c : listPost) {
				 
				 c.setUrlImg("../img/"+post.getUrlImg()+".jpg");
			}
				
				
				
			
			getSession().setAttribute("listPost", listPost);
			getSession().setAttribute("listidPost", listidPost);
		}
	}
	

//	ajouter commentaire
	@Action(value="addComment", results = { @Result(type="redirectAction",location="getAllPosts"	
	, name = "success" )})
	public String addComment() {
//			 Comment();
			
//		recuperer post de DB POUR lier avec le commentaire
			 
				post=  postService.getPostByiId(idpost);
			    comment.setPost(post);
			    comment.setUser(this.getLoggedUser());
			    
			commentService.addComment(comment);
			
			//get all the comments from database and store them in one String
			String allComments = comment.getContent()+" "+allCommentsToOneString(post);
			
			//calculate the average rating of all comments
			double rating = postService.CalculateRating(allComments);
			post.setRating(rating);
			
			postService.updatePost(post);
			
	
		return "success" ;
	}
	
	
	@Action(value="getAllPosts", results = { @Result( location = "Post.jsp"
			, name = "success" ) })
	public String getPost() {
//		Comment();
		
	
		
		 listPost=postService.getAllPost();
		return "success";
		
		
		
	}
	
	
	public String allCommentsToOneString(Post post) {
		Collection<Comment>comments=post.getComments();
		//listComments=commentService.getAllComment();
		String Allcomments="";
		for(Comment comment : comments) {
			Allcomments+=" "+comment.getContent();
		}
		
		return Allcomments;
	}
	
	
	


	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}


	public PostService getPostService() {
		return postService;
	}


	public void setPostService(PostService postService) {
		this.postService = postService;
	}



	public List<Post> getListPost() {
		return listPost;
	}



	public void setListPost(List<Post> listPost) {
		this.listPost = listPost;
	}



	public List<Comment> getListComments() {
		return listComments;
	}



	public void setListComments(List<Comment> listComments) {
		this.listComments = listComments;
	}



	public void setPost(Post post) {
		this.post = post;
	}
	
	@Override
	public void setSession(Map<String, Object> map) {
		  sessionMap=(SessionMap)map; 		
	}

	
				
			
}
