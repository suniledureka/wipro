
import java.util.Arrays;
import java.util.List;

public class ProcessingByForEach {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		//-- display each name using forEach
		names.stream().forEach(name -> System.out.print(name + "     "));
		System.out.println();
		
		//-- use a stream to convert each name to upper case and display using forEach
		names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name + "     "));
		System.out.println();
		
		//-- display all the odd numbers using forEach
		List<Integer> nums = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		nums.stream().filter(num -> num % 2 == 1).forEach(n -> System.out.print(n + "     "));

	}

}
