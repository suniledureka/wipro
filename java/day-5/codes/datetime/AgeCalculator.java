import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1987, 4, 15);
		LocalDate currentDate = LocalDate.now();
		
		Period p = Period.between(dob, currentDate);
		int yearDiff = p.getYears();
		int monthDiff = p.getMonths();
		int daysDiff = p.getDays();
		
		System.out.printf("Your Age is %d years %d months %d days", yearDiff, monthDiff, daysDiff);

	}

}
