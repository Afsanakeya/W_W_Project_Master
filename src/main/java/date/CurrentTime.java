package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {
	public static void main(String[] args) throws Throwable {
		
	
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Calendar calander = Calendar.getInstance();
	String GetCurrentTime = dateFormat.format(calander.getTime());
	System.out.println(GetCurrentTime);
	
	
	
	//Calendar caendar = Calendar.getInstance();
	calander.setTime(dateFormat.parse(GetCurrentTime));
	calander.add(Calendar.AM_PM,3);  // number of days to add
	GetCurrentTime = dateFormat.format(calander.getTime()); // dt is now the new date	
	System.out.println(GetCurrentTime);
	

    }

}
