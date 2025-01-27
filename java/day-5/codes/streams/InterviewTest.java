import java.util.stream.IntStream;

public class InterviewTest {

	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		*/
		
		/*
		IntStream in = IntStream.range(1, 11);
		in.forEach(n -> System.out.println(n));
		*/
		
		IntStream.range(1, 11).forEach(i -> {
			IntStream.rangeClosed(1, i).forEach(n -> System.out.print(n + "     "));
			System.out.println();
		});
	}
}
