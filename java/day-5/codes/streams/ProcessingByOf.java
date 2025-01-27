
import java.util.Arrays;
import java.util.stream.Stream;

public class ProcessingByOf {

	public static void main(String[] args) {
		Stream<Integer> str1 = Stream.of(12,23,45,21,15,26);
		str1.forEach(n -> System.out.print(n + "     "));
		System.out.println();
		
		Double[] data = {12.5, 23.6, 10.9, 19.2, 23.7};
		Stream<Double> str2 = Stream.of(data);
		str2.forEach(System.out::println);
		
		Stream<Double> stream = Arrays.stream(data);
		System.out.println("no of double data = " + stream.count());
	}

}
