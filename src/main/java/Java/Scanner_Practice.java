package Java;

import java.util.Scanner;

public class Scanner_Practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Fisrt Name");
		String FirstName = sc.nextLine();
		
		while (FirstName.isEmpty()|| FirstName==null) {
		
		
		if(FirstName.isEmpty()||FirstName==null) {
			System.out.println("your Must Enter your Fisrt Name");
			FirstName = sc.nextLine();
			if (FirstName!=null) {
			 continue;
				
			} 
		}
		
	}
		System.out.println("Enter your Last Name");
		String LastName = sc.nextLine();
		
		while (LastName.isEmpty()|| LastName==null) {
			
			
			if(LastName.isEmpty()||LastName==null) {
				System.out.println("your Must Enter your Last Name");
				LastName = sc.nextLine();
				if (LastName!=null) {
				 continue;
					
				} 
			}
			
		}
		
		System.out.println("Enter your Gender (Male/Fefame)");
		String Gender =sc.nextLine();
while (!Gender.matches("Male")||!Gender.matches("Female")) {
			
	
			System.out.println("Enter your Gender (Male/Fefame)");
				Gender = sc.nextLine();
				
			 
			
}
		
		System.out.println("Enter Your Age");
		int Age = sc.nextInt();
		
		if (Age<=18 && Gender.contains("Male")) {
			
			System.out.println("We are Sorry Mr."+"  " + FirstName +" "+ LastName+" "+"You are not allowed");
		}
		else if(Age<=18 && Gender.contains("Female")){
			
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
