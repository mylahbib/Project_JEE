import java.io.BufferedReader;
import java.io.FileReader;

public class SearchCSVFileV2 {
	
		  public static void main(String[] args) throws Exception {
			  
			  String filepath = "words.csv";	//Dictionary file path
				String keyWord = "\"good";		//words to search
				Search(keyWord,filepath);
		    
		  }
		  
		  public static void Search(String keyWord,String filepath){
			  
			  	String separator = ",";
			  	boolean found = false;
			  	String word = "";
			  	String value="";
			  	
			   try{
				   BufferedReader br = new BufferedReader(new FileReader(filepath));
				    String line;
				    while((line = br.readLine()) != null) {
				    	
				      String[] b = line.split(separator);
				      
				      if(b[0].equals(keyWord)){
							found = true;
							word = b[0];
							value = b[1];
						}
				   
				    }
				    
				    if(found){
						System.out.println("Name : "+word+" value : "+value);
					}else
						System.out.println("not exist");
				    
				    br.close();
			   }
			   catch (Exception e){
				   System.out.println("Error");
			   }
		  }
		
	
}
