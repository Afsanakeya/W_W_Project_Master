package regular.exp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_Data_Format {
	
	public static void main(String[] argv) {
		
		 List dates = new ArrayList();
	      dates.add("25/12/1990");
	      dates.add("25/12/1990");
	      dates.add("12/12/90");
	      dates.add("05/02/1990");
	      String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
	      Pattern pattern = Pattern.compile(regex);
	      
	      for(Object date : dates) { 
	         Matcher matcher = pattern.matcher((CharSequence) date);
	         System.out.println(date +" : "+ matcher.matches());
	      }
		
		
		
	     }

}
