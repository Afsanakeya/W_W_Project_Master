package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddFutureDate {

	public static void main(String[] args) throws Throwable {
		
		
		String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		c.add(Calendar.DATE, 1);  // number of days to add
		dt = sdf.format(c.getTime()); // dt is now the new date
		
		System.out.println(dt);

	}

}
