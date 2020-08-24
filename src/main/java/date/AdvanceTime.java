package date;

public class AdvanceTime {
	
	
	public static final int AM = 0, PM = 1;
	int hour = 0, minute = 0;
	int am_pm = AM;

	public void advance(int advance) {
	    minute += advance;
	    hour += minute / 60;
	    minute %= 60;
	    am_pm ^= (hour / 12 % 2);
	    hour %= 12;
	}

	
	
}
