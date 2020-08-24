package Java;

import java.util.Scanner;

public class SwitchCase {
	// steeing the attempt 
	private static  int attempt=0;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Fisrt Name");
		String FirstName = sc.nextLine();
		
	while (FirstName.isEmpty()|| FirstName==null||FirstName.length()>10 ||FirstName.length()<3||FirstName.matches("^[0-9]*$")
			||FirstName.length()>3 ==FirstName.contains("[0-9]*$")){
		
		
		 //setting attempt 
	if(FirstName.isEmpty()|| FirstName==null||FirstName.length()>10 || FirstName.length()<3||FirstName.matches("^[0-9]*$")) {
		
		   if (FirstName.length()<3) {
				System.out.println("First Name must be at least Three Characters");
				
			}
			
			else if (FirstName.length()>3 & FirstName.contains("[0-9]*$")) {
			
				System.out.println("Firstname cannot contain Number");
			}
			
			System.out.println("your Must Enter your Fisrt Name");
			FirstName = sc.nextLine();
			
			
			//this block will allow three attempt and after 3 invalid attempt it will stop programe
			
			
			
			attempt++;
			if(attempt>=3) {
				System.out.println("Please Try Again Later");
				return;
				
			}

		}
	
}		
		System.out.println("Enter your Last Name");
		String LastName = sc.nextLine();
		while (LastName.isEmpty()|| LastName==null||LastName.length()>10 ||LastName.length()<3||LastName.matches("^[0-9]*$")
				||LastName.length()>3 ==LastName.contains("[0-9]*$")){
			
			
			attempt++; //setting attempt 
		if(LastName.isEmpty()|| LastName==null||LastName.length()>10 || LastName.length()<3||LastName.matches("^[0-9]*$")) {
			
			   if (LastName.length()<3) {
					System.out.println("Last Name must be at least Three Characters");
					
				}
				
				else if (LastName.length()>3 & LastName.contains("[0-9]*$")) {
				
					System.out.println("Last Name cannot contain Number");
				}
				
				System.out.println("your Must Enter your Last Name");
				LastName = sc.nextLine();
				
				
				//this block will allow three attempt and after 3 invalid attempt it will stop programe
				
			
				if(attempt>=3) {
					System.out.println("Please Try Again Later");
					return;
					
				}
				
			}
		
	}	
		System.out.println("Enter your Gender (Male/Fefame)");
		String Gender =sc.nextLine();
   while (Gender.isEmpty()|| Gender==null) {
			
			attempt ++;
			if(Gender.isEmpty()||Gender!=null) {
				System.out.println("your Must Enter your Gender");
				Gender = sc.nextLine();
				if (Gender!=null) {
				// continue;
					
				} 
			}
			
			
			
			if(attempt>=3) {
				System.out.println("Please Try Again Later");
				return;
				
			}
			
			
			
		}
		System.out.println("Enter Your Age");
		int Age = sc.nextInt();
	
		
		if (Age<=17 && Gender.contains("Male")) {
			
			System.out.println("We are Sorry Mr."+"  " + FirstName +" "+ LastName+" "+"You are not allowed");
		}
		else if(Age<=17 && Gender.contains("Female")){
			
			System.out.println("We are Sorry Mis."+"  " + FirstName +" "+ LastName+" "+"You are not allowed");
		}
		
		else if (Age>=18 && Gender.contains("Male")) {
			
			System.out.println("Welcome Mr."+"  " + FirstName +" "+ LastName+" "+"& Enjoy");
		}
         else if (Age>=18 && Gender.contains("Female")){
			
			System.out.println("Welcome Mis."+"  " + FirstName +" "+ LastName+" "+"& Enjoy");
		   }
		}
	  

}
