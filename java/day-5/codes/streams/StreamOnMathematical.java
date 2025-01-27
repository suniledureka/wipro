import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamOnMathematical {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,17,18,20);
		
		System.out.println("sum: " + nums.stream().mapToInt(Integer::intValue).sum());
		
		System.out .println("count:  " + nums.stream().mapToInt(Integer::intValue).count());
		
		System.out.println("average: " + nums.stream().mapToInt(n -> n.intValue()).average().getAsDouble());
		System.out.println();
		
		System.out.println("---- SUMMARY STATISTICS -----");
		
		IntSummaryStatistics stats =  nums.stream().mapToInt(n -> Integer.valueOf(n))
												   .summaryStatistics();
		
		System.out.println("count = " + stats.getCount());
		System.out.println("maximum = " + stats.getMax());
		System.out.println("minimum = " + stats.getMin());
		System.out.println("average = " + stats.getAverage());
		System.out.println("sum = " + stats.getSum());

	}

}
