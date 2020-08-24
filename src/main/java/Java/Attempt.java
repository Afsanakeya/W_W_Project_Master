package Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Attempt {
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String Name = " ";
        int hours;
        double payRate;
        char F;
        char P;
        char T;
        char repeat;
        String input = " ";

        double grossPay;

        System.out.print("What is your name? ");
        Name = reader.nextLine();
        System.out.print("How many hours did you work? ");
        hours = reader.nextInt();
        int attempt = 0;
        while (hours < 0 || hours > 280) 
        {
                System.out.println("That's not possible, try again!");
                hours = reader.nextInt();
                //System.out.println("You have exicited your linit plaease try againg later");
              attempt++;
             if(attempt >= 3)
              {
            	 System.out.println("You have exicited your limit plaease try againg later");
                 break;
              }

            }
    }
	
}

