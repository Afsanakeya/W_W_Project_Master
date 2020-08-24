package date;

import java.util.Date;

public class InitialTime {

	public static Date InitialTime(int desireTime) {
		
		

        // creating a date object with specified time. 
        Date dateOne = new Date(); 
  
        System.out.println("Date initially: "
                           + dateOne); 
  
        // Sets the time 
       dateOne.setTime(desireTime); 
  
        // Prints the time 
        System.out.println("Date after setting"
                           + " the time: "
                           + dateOne); 
        
        return dateOne;
    } 

	
	public static void main(String[] args) {
		
		InitialTime intime = new InitialTime();
		System.out.println(intime.InitialTime(50));
		
		
		 // creating a date object with specified time. 
        Date dateOne = new Date(); 
  
        System.out.println("Date initially: "
                           + dateOne); 
  
        // Sets the time 
       dateOne.setTime(10000); 
  
        // Prints the time 
        System.out.println("Date after setting"
                           + " the time: "
                           + dateOne); 
	}
}


