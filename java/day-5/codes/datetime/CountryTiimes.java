import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CountryTiimes {

	public static void main(String[] args) {
		//ZoneId zone = ZoneId.of("America/New_York");
		//ZoneId zone = ZoneId.of("America/Los_Angeles");
		//ZoneId zone = ZoneId.of("America/Chicago");
		//ZoneId zone = ZoneId.of("Europe/Berlin");
		ZoneId zone = ZoneId.of("Europe/London");
		
		ZonedDateTime zdt = ZonedDateTime.now(zone);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss a");
		System.out.println(zdt.format(formatter));
	}

}
