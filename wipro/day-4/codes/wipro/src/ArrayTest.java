
public class ArrayTest {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("size of array = " + n.length); //5
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size n["+i+"] = " + n[i].length);
		}
	}

}
