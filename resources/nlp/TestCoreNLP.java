package stopwords;

import java.io.*;
import java.util.*;

import edu.stanford.nlp.io.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class TestCoreNLP {

  public static void main(String[] args) throws IOException {
    PrintWriter out;
   out = new PrintWriter("D:\\output1me.txt");
     
    Properties props=new Properties();
    props.setProperty("annotators","tokenize, ssplit, pos,lemma, parse");
    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    Annotation annotation;  
    	String readString = null;
	    PrintWriter pw = null;
	    BufferedReader br = null;
	    br = new BufferedReader ( new FileReader ( "D:\\inputme.txt" )  ) ;
	    pw = new PrintWriter ( new BufferedWriter ( new FileWriter ( "D:\\outputme.txt", false )  )  ) ;      
String x = null;
	    while  (( readString = br.readLine ())  != null)   {
	         pw.println ( readString ) ; String xx=readString;x=xx;//System.out.println("OKKKKK"); 
    	annotation = new Annotation(x);
 
    pipeline.annotate(annotation);    //System.out.println("LamoohAKA");
    pipeline.prettyPrint(annotation, out);
	    }
	    br.close (  ) ;
    pw.close (  ) ;
    System.out.println("Done...");
   
       
  }
  
}