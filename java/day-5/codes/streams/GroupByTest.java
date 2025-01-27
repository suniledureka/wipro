import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anil","Suraj","Praveen","Sanjay","Suraj","Anil","Anil", "anil");
		
		/*
		Map<String, Long> namesByCount = names.stream()
											  .collect(Collectors.groupingBy(name -> name, 
													  						 Collectors.counting()));
		*/
		
		Map<String, Long> namesByCount = names.stream()
				  .collect(Collectors.groupingBy(Function.identity(), 
						  						 Collectors.counting()));		
		System.out.println(namesByCount);	
		System.out.println();
		
		namesByCount.forEach((key, value) -> System.out.println(String.format("%-10s : %d", key, value)));
	}

}
