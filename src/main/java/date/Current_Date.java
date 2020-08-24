package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date {

	public static void main(String[] args) {
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		//String custom=formatter.toPattern();
	    Date date = new Date(); 
	    //System.out.println(custom); 
	    System.out.println(date);
	    String currentDate = formatter.format(date);
	    System.out.println(currentDate); 
		
	}

}
