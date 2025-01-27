import java.util.Calendar;

public class DateTest {

	public static String findDay(int month, int day, int year) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(year, month-1, day);
	    
	    System.out.println(calendar.getTime()); //return a java.util.Date
	    
	    int res = calendar.get(calendar.DAY_OF_WEEK);
	    
	    switch (res) {
	        case 1 -> {return "SUNDAY";}
	        case 2 -> {return "MONDAY";}
	        case 3 -> {return "TUESDAY";}
	        case 4 -> {return "WEDNESDAY";}
	        case 5 -> {return "THURSDAY";}
	        case 6 -> {return "FRIDAY";}
	        case 7 -> {return "SATURDAY";}
	        default -> {return "not valid ";}
	    }
	}
	
	public static void main(String[] args) {		
		System.out.println("day of week = " + findDay(11, 22, 2024) ); //MM, DD, YYYY
	}
}
