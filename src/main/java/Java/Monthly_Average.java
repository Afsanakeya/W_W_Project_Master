package Java;

import java.util.Arrays;

public class Monthly_Average {
	static int []sale = {100,200,300,400,500,600,700};
	static double total=0;
	static double max=0;
	static double i;
	public static void main(String[] args) {
		
		
		

//return max; 
//System.out.println(total);
		Arrays.parallelSort(sale);
		double mini= sale[0];
		double Max= sale[sale.length-1];
		System.out.println("Ninimun Value is" + mini);
		System.out.println("Maximum Value is" + Max);

for(double element:sale) 
	
	total+=element;
	//double max=0;
	 //double max = sale[0]; 
     
     // Traverse array elements from second and 
     // compare every element with current max   
    
 
double average = 0;
 
 if (sale.length>0) {
	 
	 average = total/sale.length;
    }
	 
 
	System.out.println("Average is "+average);
	
	for (int ele:sale)
		if(average<ele) {
		System.out.println(ele);
		}
		
	
  
System.out.println("LARGEST NUMBER IS "+largest());




   }
	static double largest() 
	{ 
		int i; 
	      
	    // Initialize maximum element 
		double max = sale[0]; 
	   
	    // Traverse array elements from second and 
	    // compare every element with current max   
	    for (i = 1; i < sale.length; i++) 
	        if (sale[i] > max) 
	            max = sale[i]; 
	   
	    return max; 
	} 
}