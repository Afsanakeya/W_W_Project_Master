package date;

import java.util.Calendar;
import java.util.Date;

public class SetTime {

	public static void main(String args[]) {
		
		SetTime setTime = new SetTime();
		
	    Calendar day = Calendar.getInstance();
			day.set(Calendar.MILLISECOND,0);
			day.set(Calendar.SECOND,0);
			day.set(Calendar.MINUTE,59);
			day.set(Calendar.HOUR_OF_DAY,10);
			Date SetTime =day.getTime();
			System.out.println(SetTime);
			Date stTime =setTime.SetTime(0,10,50);
			System.out.println(stTime);
			
	
	}
	
	public Date SetTime(int hour,int minute, int seconds) {
		
		 Calendar day = Calendar.getInstance();
		    day.set(Calendar.HOUR_OF_DAY,hour);
		    day.set(Calendar.MINUTE, minute);
		    day.set(Calendar.SECOND,seconds);
			//day.set(Calendar.MILLISECOND,milliseconds);
			
			
			
			Date SetTime =day.getTime();
			System.out.println(SetTime);
	return SetTime;
	}
}
