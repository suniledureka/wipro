
public class IntegerTypes {

	public static void main(String[] args) {
		intTypes();
	}

	private static void intTypes() {
		byte b = 127;
		System.out.println(b);
		
		//b = 128; //Type mismatch: cannot convert from int to byte
		b = (byte)128;
		System.out.println(b);
		
		b = (byte)1000;
		System.out.println(b); //-24
		
		long pop = 2147483647;
		System.out.println("world population = " + pop);
		
		pop = 2147483648L;
		System.out.println("world population = " + pop);
	}

}
