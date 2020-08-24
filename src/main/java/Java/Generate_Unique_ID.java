package Java;

import java.util.UUID;

public class Generate_Unique_ID {

	public static void main(String[] args) {
		
		/* this is just to generate randon number
		 //here 20 means 
		List<Integer> range = IntStream.range(0,20).boxed()
		        .collect(Collectors.toCollection(ArrayList::new));
		Collections.shuffle(range);
		//here 10 means the length of id will be 10 digit
		range.subList(0,10).forEach(System.out::println);
		*/
		
		UUID uniqueKey = UUID.randomUUID(); 
		
		  System.out.println (uniqueKey);  

	}

}
