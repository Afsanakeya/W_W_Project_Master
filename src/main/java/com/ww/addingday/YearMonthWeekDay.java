package com.ww.addingday;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class YearMonthWeekDay {
	public static void main(String args[]) {
	      Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	      //getTime() returns the current date in default time zone
	      Date date = calendar.getTime();
	      int day = calendar.get(Calendar.DATE);
	      //Note: +1 the month for current month
	      int month = calendar.get(Calendar.MONTH) + 1;
	      int year = calendar.get(Calendar.YEAR);
	      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	      int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	      int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

	      System.out.println("Current Date is: " + date);
	      System.out.println("Current Day is:: " + day);
	      System.out.println("Current Month is:: " + month);
	      System.out.println("Current Year is: " + year);
	      System.out.println("Current Day of Week is: " + dayOfWeek);
	      System.out.println("Current Day of Month is: " + dayOfMonth);
	      System.out.println("Current Day of Year is: " + dayOfYear);

	   }

}
