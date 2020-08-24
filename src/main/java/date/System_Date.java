package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class System_Date {

	public static void main(String[] args) {
		
		

		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date(); 
		    String currentDate = formatter.format(date);
		    System.out.println(currentDate);  
		    

	}

}
