package Java;

import java.util.Scanner;

public class Random {
	public static void main(String[] argv) 
	        throws Exception 
	    { 
	  
	        try { 
	  
	            String s = "Gfg"; 
	  
	            // create a new scanner 
	            // with the specified String Object 
	            Scanner scanner = new Scanner(s); 
	  
	            scanner.close(); 
	  
	            // Prints the new line 
	            System.out.println(scanner.nextLine()); 
	            scanner.close(); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception thrown: " + e); 
	        } 
	    } 

}
