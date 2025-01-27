import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ProcessingByCollect2Map {

	public static void main(String[] args) {
		List<String> courseNames = Arrays.asList("Core Java", "Advanced Java", "Spring", "Spring Boot", "Microservices",
				"React");
		System.out.println(courseNames);

		// create a new list of courses with each course name in capital letters
		/*
		 * Stream<String> courseNamesStream = courseNames.stream().map(new
		 * Function<String, String>() {
		 * 
		 * @Override public String apply(String t) { return t.toUpperCase(); } });
		 * List<String> courseNames1 = courseNamesStream.collect(Collectors.toList());
		 */

		List<String> courseNames1 = courseNames.stream().map(cn -> cn.toUpperCase()).collect(Collectors.toList());
		System.out.println(courseNames1);
		System.out.println();

		// ============***** ===================
		List<String> courseNamesWithLength = courseNames.stream()
														.map(cn -> String.format("%-15s  - %2d", cn.toUpperCase(), cn.length()))
														.collect(Collectors.toList());
		for (String courseName : courseNamesWithLength) {
			System.out.println(courseName);
		}
		System.out.println("-".repeat(100));
		// ============***** ===================
		List<String> courseNamesWithLength6 = courseNames.stream()
														 .filter(cn -> cn.length() > 6)
														 .map(cn -> String.format("%-15s  - %2d", cn.toUpperCase(), cn.length()))
														 .collect(Collectors.toList());
		//courseNamesWithLength6.forEach((String t) -> System.out.println(t));				
		courseNamesWithLength6.forEach(t -> System.out.println(t));
	}

}
