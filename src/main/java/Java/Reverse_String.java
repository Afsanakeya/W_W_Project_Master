package Java;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
      
		/*
		 * System.out.println("Enter string to reverse:");
		 * 
		 * Scanner read = new Scanner(System.in); String str = read.nextLine();
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(int i = str.length() - 1; i >= 0; i--) 
		 * { sb.append(str.charAt(i)); }
		 * 
		 * System.out.println("Reversed string is:"); System.out.println(sb.toString());
		 */
		
		/*
		 System.out.println("Enter string to reverse:");
	        
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        
	        StringBuilder sb = new StringBuilder(str);
	        
	        System.out.println("Reversed string is:");
	        System.out.println(sb.reverse().toString());
		*/
		
		/*
		String s="This is a string";
		char arr[]=s.toCharArray(); // convert a string into character array and save it in a variable
		// check if the string is empty or null
		if(s.isEmpty()|| s ==null)
		{
		System.out.println("Empty string is not accepted");
		}
		// print the string in reverse order
		for(int i = arr.length-1; i>=0; i--) 
			System.out.println(i);
		
		//System.out.println(arr[i]);
	
		
		*/
		 String input = "Sony"; 
		// check if the string is empty or null
			if(input.isEmpty()|| input ==null)
			{
			System.out.println("Empty string is not accepted");
			}
	        // convert String to character array 
	        // by using toCharArray 
	        char try1[] = input.toCharArray(); 
	  
	        for (int i = try1.length-1; i>=0; i--) 
	            System.out.print(try1[i]);
	}
	        /*
	        public static String reverseString(String str){  
	            char ch[]=str.toCharArray();  
	            String rev="";  
	            for(int i=ch.length-1;i>=0;i--){  
	                rev+=ch[i];  
	            }  
	            return rev; 
	             
	        }  
	        */
	    } 
		
	


