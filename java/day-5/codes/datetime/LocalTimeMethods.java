import java.time.LocalTime;

public class LocalTimeMethods {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int nano = time.getNano(); //Gets the nano-of-second field. the nano-of-second, from 0 to 999,999,999
		
		System.out.printf("%d:%d:%d:%d\n", hh, mm, ss, nano);
		
		
		LocalTime time1 = LocalTime.of(23, 15, 45);//HH, mm, ss
		System.out.println(time1);
		
		System.out.println(time.isBefore(time1));
		System.out.println(time.isAfter(time1));
	}

}
