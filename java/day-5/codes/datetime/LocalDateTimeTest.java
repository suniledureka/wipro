import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY:MM:dd HH:mm:ss");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("y:M:d H:m:s a"); //am/pm
		
		String formattedDt = dt.format(format);
		System.out.println(formattedDt);
		
		dt = LocalDateTime.of(2023, 3, 15, 9, 41);
		System.out.println(dt);
		
		LocalDateTime dt1 = dt.withDayOfMonth(4).withYear(2024);
		System.out.println(dt1);
		
		LocalDateTime dt2 = dt.plusMonths(6);
		System.out.println(dt2);
		
		LocalDateTime dt3 = dt.minusMonths(6);
		System.out.println(dt3);
		//work on all the additional method
	}

}
