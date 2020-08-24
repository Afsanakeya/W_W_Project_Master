package com.ww.addingday;

import java.time.LocalDate;

public class AddingDaysInCalander {
	
	public static void main(String args[]){
	       //Adding one Day to the current date
	       LocalDate date =  LocalDate.now().plusDays(1);
	       System.out.println("Adding one day to current date: "+date);
		  
		//Adding number of Days to the current date
		LocalDate date2 =  LocalDate.now().plusDays(7);
		System.out.println("Adding days to the current date: "+date2);
		  
		//Adding one Day to the given date
		LocalDate date3 = LocalDate.of(2016, 10, 14).plusDays(1);
		System.out.println("Adding one day to the given date: "+date3);
		  
		//Adding number of Days to the given date
		LocalDate date4 = LocalDate.of(2016, 10, 14).plusDays(9);
		System.out.println("Adding days to the given date: "+date4);
	   }

}
