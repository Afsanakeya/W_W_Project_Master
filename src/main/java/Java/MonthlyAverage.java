package Java;


public class MonthlyAverage {
	
	public static void main(String[] args) {
		
		int[] run = { 281, 344, 265, 272, 236, 324, 287 };
		double total = 0;
		// double max=0;
		// double i;

		for (double element : run)

			total += element;

		double average = 0;

		if (run.length > 0) {

			average = total / run.length;
		}

		System.out.println("Average run is " + average);

		for (int ele : run)

			if (average == ele) {
				System.out.println("Equals to average run are  " + ele);
			}

			else if (average > ele) {
				System.out.println("Less than average run are  " + ele);
			}

			else if (average < ele) {
				System.out.println("More than average run are  " + ele + "\n");
			}

		int counter = 0;
		for (int i = 0; i < run.length; i++)
			if (run[i] > average) {
				counter = counter + 1;

			}
		System.out.println("runs more than average are  " + counter);

	}
	

}
