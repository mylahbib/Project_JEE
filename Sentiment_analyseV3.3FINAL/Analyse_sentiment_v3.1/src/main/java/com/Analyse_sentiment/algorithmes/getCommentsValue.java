package com.Analyse_sentiment.algorithmes;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class getCommentsValue {

	private static Scanner scanner;
	public static double getOneWordRating(String keyWord , String dictionaryPath){
		
		boolean found = false;	//found = true when the word is found on the dicionary
		String word = "";		//
		String value="";
		double rate = 0;
		
		
		try{
			scanner = new Scanner(new File(dictionaryPath));
			scanner.useDelimiter("[,\n]");	
			
			while(scanner.hasNext() && !found){		
				word = scanner.next();		//varibal word store the given word
				value = scanner.next();		//value stores 1 or -1
				
				if(word.equals(keyWord)){
					found = true;
				}
			}
			
			if(found){
				rate = Double.parseDouble(value); 	//we convert the String to double
				
			}
		}
			
		catch(Exception e){
			System.out.println("Error");
		}
		
		return rate;
	}
	

	public static double getCommentsRating(String wordList, String dictionaryPath){
		int size = 0;
		double totalRating = 0;
		double wordRating;
		
		
		StringTokenizer word = new StringTokenizer(wordList, " ");
			while(word.hasMoreTokens()){
				
				wordRating = getOneWordRating(word.nextToken(), dictionaryPath);
				totalRating+=wordRating;
				//we will sum only if the word -1 or +1
				if(wordRating!=0) 
					size++;
					
			}
			return totalRating / size;
	}

	
	
}

	

