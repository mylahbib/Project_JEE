import java.io.File;
import java.util.Scanner;

public class SearchCSVFile {

	private static Scanner scanner;
	
	public static void main(String []args){
		String filepath = "words.csv";	//Dictionary file path
		String keyWord = "\"good";		//words to search
		Search(keyWord,filepath);
		
		
	}
	
	
	//Search function : takes the word that we are looking for + the path of dictionary
	public static void Search(String keyWord,String filepath){
		
		boolean found = false;	//found = true when the word is found on the dicionary
		String word = "";		//
		String value="";
		
		try{
			scanner = new Scanner(new File(filepath));
			scanner.useDelimiter("[,\n]");	
			
			while(scanner.hasNext() && !found){		
				word = scanner.next();		//varibal word store the given word
				value = scanner.next();		//value stores 1 or -1
				
				if(word.equals(keyWord)){
					found = true;
				}
			}
			
			if(found){
				System.out.println("Name : "+word+" value : "+value);		
			}else
				System.out.println("not exist");
				
			
			
		}catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	
}
