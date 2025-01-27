import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingByCollect {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 20);
		System.out.println("origunal data = " + nums);

		// -- make a copy of nums using Stream
		Stream<Integer> numsStream = nums.stream();
		List<Integer> newNums = numsStream.collect(Collectors.toList());
		System.out.println(newNums);
		System.out.println();

		// System.out.println(numsStream.count()); //java.lang.IllegalStateException:
		// stream has already been operated upon or closed

		// collect even numbers from nums list - traditional approach
		List<Integer> evenNums = new ArrayList<Integer>();
		for (Integer num : nums) {
			if (num % 2 == 0) {
				evenNums.add(num);
			}
		}
		System.out.println("even numbers (traditional approach) = " + evenNums);
		System.out.println();

		// collect even numbers from nums list - using stream and anonymous class
		Stream<Integer> numsStream1 = nums.stream();
		Stream<Integer> evensStream = numsStream1.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0)
					return true;
				return false;
			}
		});
		
		List<Integer> evensList = evensStream.collect(Collectors.toList());
		System.out.println("even nums list = " + evensList);
		System.out.println();
		
		// collect odd numbers from nums list - using stream and lambdas
		Stream<Integer> numsStream2 = nums.stream();
		Stream<Integer> oddStream = numsStream2.filter(n -> n%2 != 0);
		List<Integer> oddList = oddStream.collect(Collectors.toList());
		System.out.println("odd nums list = " + oddList);
		System.out.println();
		
		List<Integer> oddList1 = nums.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println("odd nums list = " + oddList1);
	}

}
