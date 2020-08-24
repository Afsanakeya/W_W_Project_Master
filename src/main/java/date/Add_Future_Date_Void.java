package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Add_Future_Date_Void {

	
		
		public static String SetFutureDate(String givenDate,int FuturefDays) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        Calendar cal = Calendar.getInstance();
	        String setFutureDate = null;
	    try {
	        cal.setTime(dateFormat.parse(givenDate));
	        cal.add(Calendar.DATE, FuturefDays);

	        setFutureDate = dateFormat.format(cal.getTime());

	    } catch (ParseException ex) {
	      //  Logger.getLogger(GR_TravelRepublic.class.getName()).log(Level.SEVERE, null, ex);
	    }finally{
	    dateFormat = null;
	    cal = null;
	    }

	    return setFutureDate;

	}
		public static Date DateaddDays(Date date, int days) {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.DATE, days); //minus number would decrement the days
	        return cal.getTime();
	    }
		
		
		
		
		public static String SetFutureDate(int FuturefDays) {
	        SimpleDateFormat formatter = new SimpleDateFormat("dd");
	        Date date = new Date(); 
	        Calendar cal = Calendar.getInstance();
	        String currentDate = formatter.format(date);
	        String setFutureDate = null;
	    try {
	        cal.setTime(formatter.parse(currentDate));
	        cal.add(Calendar.DATE,FuturefDays);

	        setFutureDate = formatter.format(cal.getTime());

	    } catch (ParseException ex) {
	      //  Logger.getLogger(GR_TravelRepublic.class.getName()).log(Level.SEVERE, null, ex);
	    }finally{
	    	formatter = null;
	    cal = null;
	    }

	    return setFutureDate;

	}
		public static void main(String[] args) {
			System.out.println(SetFutureDate(1));
			
		}
}

