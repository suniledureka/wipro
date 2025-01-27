import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneTest {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone); //Asia/Calcutta
		
		ZonedDateTime dt = ZonedDateTime.now();
		System.out.println(dt);
		System.out.println("zone = " + dt.getZone());
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("y:M:d H:m:s a z"); 
		
		String formattedDt = dt.format(format);
		System.out.println(formattedDt);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for(String zoneName : zones) {
			System.out.println(zoneName);
		}
	}

}
