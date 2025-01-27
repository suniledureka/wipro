import java.util.Arrays;
import java.util.List;

public class ProcesssingByCount {

	public static void main(String[] args) {
		List<String> participants = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		//-- find the number of participants using stream
		long noOfParticipants = participants.stream().count();
		System.out.println("no of participants = " + noOfParticipants);
		
		//-- find the number of participants whose name size is greater than 5 characters
		noOfParticipants = participants.stream()
									   .filter(part -> part.length()>5)
									   .count();
		
		System.out.println("no of particpnats whose name size is > 5 = " + noOfParticipants);
		System.out.println();
		
		participants.stream()
					.filter(part -> part.length()>5)
					.forEach(part -> System.out.println("---> " + part));
					//.forEach(System.out::println);
	}

}
