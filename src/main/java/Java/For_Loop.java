package Java;

public class For_Loop {
	
public static void main(String[] args) {
	
	int i;
	for (i = 0; i < 5; i++) {
	    if (i >= 3) {
	        break;
	    }
	    System.out.println("Yuhu");
	    if (i >= 1) {
	        continue;
	    }
	    System.out.println("Tata");
	}
	System.out.println(i);
}

}
