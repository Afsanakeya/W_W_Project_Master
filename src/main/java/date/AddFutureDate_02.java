package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddFutureDate_02 {
	
	public static void main(String[] args) throws Throwable {
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date(); 
	    String currentDate = formatter.format(date);
	    System.out.println(currentDate); 
	    //SimpleDateFormat satedformate = new SimpleDateFormat("yyyy-MM-dd");
		Calendar caendar = Calendar.getInstance();
		caendar.setTime(formatter.parse(currentDate));
		caendar.add(Calendar.DATE, 1);  // number of days to add
		currentDate = formatter.format(caendar.getTime()); // dt is now the new date	
		System.out.println(currentDate);
		
	}

}
