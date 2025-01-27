import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		
		list.add(Arrays.asList("a","b","c"));
		list.add(Arrays.asList("d","e","f","a"));
		list.add(Arrays.asList("g","h","i"));
		list.add(Arrays.asList("j","k","a", "l"));

		List<String> mappedList = list.stream()
									  .flatMap(s -> s.stream())
									  .collect(Collectors.toList());
		System.out.println(mappedList);
		System.out.println();
		
		//--apply flatMap to get the data in uppercase
		List<String> mappedList1 = list.stream()
									   .flatMap(st -> st.stream()
											   			.map(str -> str.toUpperCase()))
									   .collect(Collectors.toList());
		System.out.println(mappedList1);
		System.out.println();
		
		//--apply flatMap to apply a filter to get only "a"
		List<String> mappedList2 = list.stream()
									   .flatMap(st -> st.stream()
											   			.filter(str -> str.equalsIgnoreCase("A")))
									   .collect(Collectors.toList());
		System.out.println(mappedList2);
		System.out.println();		
	}

}
