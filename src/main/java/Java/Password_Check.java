package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Password_Check {
	public static void main(String[] args) {
		/*
		 * String text = "1"; //String number="123";
		 * 
		 * if (text.matches("[A-aZ-Z-0-9]+") == true && text.length() > 1) { //number =
		 * text; System.out.println("Match"); } else {
		 * System.out.println(" Doesnt Match"); }
		 */
		/*String FirstName ="kfjbksds";
		
		if (!FirstName.matches("^[a-z]*[a-z]?$")) {
			
				System.out.println("Firstname cannot contain Number");
			}
	
		else {
			System.out.println("ok");
		}*/
		/*String s = "My Name Is afsana Keya and I can drive a car";
		String sp []=s.split("a");
		System.out.println(sp[5]);
		*/
		/*
		List<Integer> range = IntStream.range(0,20).boxed()
		        .collect(Collectors.toCollection(ArrayList::new));
		Collections.shuffle(range);
		range.subList(0,10).forEach(System.out::println);
		*/
		
		/*
		UUID uniqueKey = UUID.randomUUID(); 
		
		  System.out.println (uniqueKey);  
		
		*/
		//public int wordCount(final String sentence) {
		    // If sentence is null, throw IllegalArgumentException.
		/*
		 * String sentence = " m"; if(sentence == null) { //throw new
		 * IllegalArgumentException("Sentence cannot be null.");
		 * System.out.println("bjbjkjjbjb"); } // If sentence is empty, throw
		 * IllegalArgumentException.
		 * 
		 * // If sentence ends with a space, throw IllegalArgumentException. "$" matches
		 * the end of a String in regex. if(sentence.matches(".* $")) { //throw new
		 * IllegalArgumentException("Sentence cannot end with a space.");
		 * System.out.println("Sentence cannot end with a space."); } // If sentence
		 * starts with a space, throw IllegalArgumentException. "^" matches the start of
		 * a String in regex. if(sentence.matches("^ .*")) { // throw new
		 * IllegalArgumentException("Sentence cannot start with a space.");
		 * System.out.println("Sentence cannot start with a space"); }
		 */

		    //int wordCount = 0;

		    // Do wordcount operation...

		 //   return wordCount;
		/*
		
		String[] basket = new String[]{"apple", "", "banana"};

		for (int i =0; i<basket.length;i++) {
		    if (basket[i] == "apple") {
		        System.out.println ("I have an " +basket[i]+ " !");
		        break;
		    }
		} 
		*/
		/*
		String[] fruitArray = {"String1", "String2", "String3", "String4","String5"};
		//System.out.println( fruitArray.length );
		//System.out.println( fruitArray[0] );
		System.out.println( fruitArray[1] );
		System.out.println( fruitArray[3] );
		System.out.println( fruitArray[4] );
		*/
		
		String[] szInput = {"input file---hello.txt file", "hello", "java", "hello", "java", "output file--xyz.txt file", "hello", "java"}; // you create it by reading all lines of the input file!!!
		Set<String> szSet = new HashSet<String>(Arrays.asList(szInput)); // the same string will create the same hash so duplicates will be removed...
		String[] szOutput = szSet.toArray(new String[szSet.size()]); // write to output file
		
		
		}
		
		
  }
