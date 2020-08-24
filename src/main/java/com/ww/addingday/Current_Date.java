package com.ww.addingday;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Current_Date {
	public static void main(String[] args) {    
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");  
		   LocalDateTime CurrentDate = LocalDateTime.now();  
		   System.out.println(dtf.format(CurrentDate)); 
		   
		  
		   }
		  }    


