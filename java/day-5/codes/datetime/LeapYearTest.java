import java.time.Year;
import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter an year to check for leap or not: ");
		int yr = sc.nextInt();
		
		Year year = Year.of(yr);
		if(year.isLeap())
			System.out.println(yr + " is a LEAP YEAR");
		else
			System.out.println(yr + " is NOT a LEAP YEAR");

	}

}
