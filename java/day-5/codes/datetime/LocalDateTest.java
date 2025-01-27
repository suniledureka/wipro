import java.time.LocalDate;
import java.util.Date;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); //Obtains the current date from the system clock in the default time-zone. 
		System.out.println(today); //YYYY-MM-DD
		
		//LocalDate ld = LocalDate.of(2024, 12, 32);//java.time.DateTimeException
		LocalDate ld = LocalDate.of(2024, 12, 31); //year, month, day of month
		System.out.println(ld);	
	
		//in prior version of Java
		java.util.Date d = new Date();
		System.out.println(d);
		System.out.println("month = " + d.getMonth()); //10 - month is ranging from 0 - 11 in java.util.Date 
	}

}
