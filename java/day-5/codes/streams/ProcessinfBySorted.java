
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessinfBySorted {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50, 50, 82);
		System.out.println(marks);
		
		/*
		 //-- normal approach
		Collections.sort(marks);
		System.out.println(marks);
	   */
		
		List<Integer> marksInAscending = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("marks in the order of ASC = " + marksInAscending);
		
		List<Integer> marksInDescending = marks.stream()
											   .sorted((in1, in2) -> (in1>in2) ? -1 : 1)
											   .collect(Collectors.toList());
		System.out.println("marks in the order of DESC = " + marksInDescending);
		
		marksInDescending = marks.stream()
								 .sorted(Comparator.reverseOrder()) //Returns a comparator that imposes the reverse of the natural ordering
								 .collect(Collectors.toList());
		System.out.println("marks in the order of DESC = " + marksInDescending);
	}

}
