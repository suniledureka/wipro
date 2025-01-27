
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProcessingByMinAndMax {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		System.out.println(marks);
		
		//get the minimum mark	
		Optional<Integer> minOpt = marks.stream().min((o1, o2) -> (o1-o2));
		if(minOpt.isPresent()) {
			Integer minMark = minOpt.get();
			System.out.println("Least Mark = " + minMark);
		}
		
		//get the maximum mark
		Integer maxMark = marks.stream().max((in1, in2) -> (in1-in2)).get();
		System.out.println("Maximum Mark = " + maxMark);
	}

}
