package com.ww.addingday;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddHours {

	public static void main(String[] args) {
	      Calendar calendar = Calendar.getInstance();
	      SimpleDateFormat formatter = new SimpleDateFormat("H.mm");
	      String time = formatter.format(calendar.getTime());
	      System.out.println("Current Date = " + time);
	      // Incrementing hours by 5
	      calendar.add(Calendar.HOUR_OF_DAY,1 );
	      System.out.println("Updated Date = " + calendar.getTime());
	   }
}
