package com.Analyse_sentiment.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.service.PostService;
import com.Analyse_sentiment.service.impl.GsPostServiceImpl;
@ResultPath("/pages/")
public class PostAction extends BaseAction {

	private static final long serialVersionUID = 1L;



	@Autowired
	private PostService postService;
	
	@Autowired
	private ServletContext servletContext;
	
	private List<Post> listPost ;
	private Post post;
	
	private File upload;
	
	
	public static Integer uploadsFileName= 0;
	private String uploadsContentType; 
	
		
	public PostAction() {
		
	}
	@Action(value="showPostForm", results = { @Result( name = "success" , location = "addPost.jsp") },    
			interceptorRefs={
	        @InterceptorRef(
		            params={"allowedTypes","image/jpg",
				    "maximumSize","1000000"}, 
		            value="fileUpload"
		        ),
		        @InterceptorRef("defaultStack"),
		        @InterceptorRef("validation")
	    })
	public String showPostForm() {
		
		return SUCCESS;
		
		
	}
	
	@Action(value="addPost", results = { @Result(type="redirectAction", location = "showPostForm", name = "success" ) })
	public String addPost() {
		 
		 
		 
		 FileInputStream fis;
 		FileOutputStream fos;
 		
				try {
					fis = new FileInputStream(upload);
					
					 ++PostAction.uploadsFileName ;
					this.setUploadsContentType(upload.getName());
					String contentType = getUploadsContentType();
					System.out.println(contentType);
					
						String path="/home/candlelight/workspace/"+servletContext.getContextPath()
						+"/src/main/webapp/img/"+getUploadsFileName().toString()+".jpg";
						
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
				; 
			
		
			
				post.setUrlImg(getUploadsFileName().toString() );
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
	public Integer getUploadsFileName() {
		return uploadsFileName;
	}
	public void setUploadsFileName(Integer uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}
	public String getUploadsContentType() {
		return uploadsContentType;
	}
	public void setUploadsContentType(String uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	
	
}
