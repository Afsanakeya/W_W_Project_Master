package Java;

import java.util.Scanner;

public class Switch {

		public static int attempt=0;
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Fisrt Name");
			String FirstName = sc.nextLine();
			
			
			while (FirstName.isEmpty()|| FirstName==null||FirstName.length()>10 ||FirstName.length()<3
				  ||!FirstName.matches("^[A-z]*[a-z]?$")){
			 
				attempt ++;
		if(FirstName.isEmpty()|| FirstName==null){
			System.out.println("First Name cannot be empty");
			
			
		}
		         else if (FirstName.length()<3){
					System.out.println("First Name must be at least Three Characters");	
				}
				else if (!FirstName.matches("^[a-z]*[a-z]?$")){
					System.out.println("Frist Name Cannot contain Nuber or Space");
					
				}
				/*
				else if(FirstName.matches(".* $")) {
				       //throw new IllegalArgumentException("Sentence cannot end with a space.");
				    	System.out.println("Sentence cannot end with a space.");
				    }
				    // If sentence starts with a space, throw IllegalArgumentException. "^" matches the start of a String in regex.
				else if(FirstName.matches("^ .*")) {
				       // throw new IllegalArgumentException("Sentence cannot start with a space.");
				    	 System.out.println("Sentence cannot start with a space");
				    }
				*/
				else if (FirstName.length()>10) {
					System.out.println("First Name must be less than ten characters");
				}
				
				System.out.println("your Must Enter your Fisrt Name");
				FirstName = sc.nextLine();
				//if (FirstName!=null) {
				 //continue;
					
				//} 
				
				if(attempt>=3) {
				System.out.println("Please try again later!");
				
				//System.out.println(Eror_Msg.FirstNameError());
				//break;
				return;
				
			}
		}
		//}
			
			System.out.println("Enter your Last Name");
			String LastName = sc.nextLine();
			while (LastName.isEmpty()|| LastName==null||LastName.length()>10 ||LastName.length()<3
				    ||!FirstName.matches("^[A-z]*[a-z]?$")){
			
			
		//if(FirstName.isEmpty()|| FirstName==null||FirstName.length()>10 || FirstName.length()<3||FirstName.matches("[0-9]")){
				if (LastName.length()<3){
					System.out.println("Last Name must be at least Three Characters");	
				}
				else if (!LastName.matches("^[a-z]*[a-z]?$")){
					System.out.println("Last Name Cannot contain Nuber or Space");
					
				}
				
				
				else if (LastName.length()>10) {
					System.out.println("Last Name must be less than ten characters");
				}
				
				System.out.println("your Must Enter your Last Name");
				LastName = sc.nextLine();
				//if (FirstName!=null) {
				 //continue;
					
				//} 
				//System.out.println("Please try again later!");
				return;
			}
			System.out.println("Enter your Gender (Male/Fefame)");
			String Gender =sc.nextLine();
	while (!Gender.matches("Male")&& !Gender.matches("Female")) {
		if (!Gender.matches("Male")&& !Gender.matches("Female")) {	
		//for (int i = 4; i <= 4; i++) {
				System.out.println("Enter your Gender (Male/Fefame)");
					Gender = sc.nextLine();
					System.out.println("Try again later!");
					return;
					//continue;
		   }
			
			
	   }	
			
	//}
				
			
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


