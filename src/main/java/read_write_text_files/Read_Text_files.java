package read_write_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Text_files {

	public static void main(String[] args) throws IOException {
        /*
		File file = new File("./Files/Textfile2.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st;
		  while ((st = br.readLine()) != null) { 
		    System.out.println(st); 
		  } 
		  
		  */
		  
		  File fl = new File("./Files/Textfile2.txt"); 
			    Scanner sc = new Scanner(fl); 
			  
			    while (sc.hasNextLine()) 
			      System.out.println(sc.nextLine()); 
		
		/*
		 //This code block also works 
		try {
            FileReader reader = new FileReader("./Files/Textfile2.txt");
           
            //System.out.println();
           int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        
    }
	
}
