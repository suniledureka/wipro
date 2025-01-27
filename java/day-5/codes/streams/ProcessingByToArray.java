
import java.util.Arrays;
import java.util.List;

public class ProcessingByToArray {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		
		Object[] objArray = nums.stream().toArray();
		System.out.println(Arrays.toString(objArray));
		
	
		Integer[] intArray = nums.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));

	}

}
