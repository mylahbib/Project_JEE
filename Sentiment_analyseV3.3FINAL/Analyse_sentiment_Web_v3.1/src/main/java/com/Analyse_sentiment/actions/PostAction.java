package com.Analyse_sentiment.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.bo.User;
import com.Analyse_sentiment.service.PostService;
import com.Analyse_sentiment.service.impl.GsPostServiceImpl;
@ResultPath("/pages/")


public class PostAction extends BaseAction implements SessionAware{

	private static final long serialVersionUID = 1L;
	private SessionMap<String,Object> sessionMap;  

	private User loggedUser; //we will get the logged user from the session and store it here

	@Autowired
	private PostService postService;
	
	@Autowired
	private ServletContext servletContext;
	
	private List<Post> listPost ;
	private Post post;
	
	private File upload;
	
	
	
	public static String uploadsFileName;
	private String uploadsContentType; 
	
	
	/*
	 * this function get the logged user from session, then returns it
	 */
	public User getLoggedUser() {
		
		loggedUser = (User) sessionMap.get("loggedUser");
		
		return loggedUser;
	}
	
	
	
	public PostAction() {
		
	}
	@Action(value="showPostForm", results = { 
			@Result( name = "success" , location = "addPost.jsp"),
			@Result(name="login" ,location="login.jsp")},    
			
			interceptorRefs={
	        @InterceptorRef(
		            params={"allowedTypes","image/jpg",
				    "maximumSize","1000000"}, 
		            value="fileUpload"
		        ),
		        @InterceptorRef("defaultStack"),
		        @InterceptorRef("validation")
	    })
	
	 public String isLogged(){  
        HttpSession session=ServletActionContext.getRequest().getSession(false);  
        if(session==null || session.getAttribute("login")==null){  
            return "login";  
        }  
        else  	
        	return SUCCESS;
    
	}
		
	
	
	@Action(value="addPost", results = { @Result(type="redirectAction", 
			location = "getAllPosts", name = "success" ) })
	public String addPost() {
		 
		 
		 
		 FileInputStream fis;
 		FileOutputStream fos;
 		
				try {
					fis = new FileInputStream(upload);
					SimpleDateFormat forma = new SimpleDateFormat("yyyyMMddd'T'HHmmss");
					 uploadsFileName = String.valueOf(forma.format(new Date()));
					this.setUploadsContentType(upload.getName());
					String contentType = getUploadsContentType();
					System.out.println(contentType);
					
				String path="D:\\"+getUploadsFileName()+".jpg";
				System.out.println("************************************************");		
				System.out.println(path);
		    		 fos = new FileOutputStream(path);

		    		
					byte[] b = new byte[1024];
					while(fis.read(b) != -1){
				    	fos.write(b);
				    }
					
		
				    fos.close();
				    fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				
				}
					
				post.setUser(this.getLoggedUser());
				post.setUrlImg(getUploadsFileName() );
			    new Timer( true );
				post.setCreated_date( new Date());
				
				
				postService.addPost(post);
				
				return SUCCESS;
		
	}
	
	


	
	public List<Post> getListPost() {
		return listPost;
	}

	public void setListPost(List<Post> listPost) {
		this.listPost = listPost;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	public PostService getPostService() {
		return postService;
	}

	public void setPostService(PostService postService) {
		this.postService = (GsPostServiceImpl) postService;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	
	public String getUploadsContentType() {
		return uploadsContentType;
	}
	public void setUploadsContentType(String uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}
	@Override
	public void setSession(Map<String, Object> map) {
		  sessionMap=(SessionMap)map; 		
	}



	public static String getUploadsFileName() {
		return uploadsFileName;
	}



	public static void setUploadsFileName(String uploadsFileName) {
		PostAction.uploadsFileName = uploadsFileName;
	}

	
	
}
