
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		
		b = -128;
		System.out.println(b);
		
		//b = 128; //Type mismatch: cannot convert from int to byte
		b = (byte) 128; //-128
		System.out.println(b);
		
		b = (byte) 1000; //-24
		System.out.println(b);
		
		long pop = 2147483647;
		System.out.println("world population = " + pop);
		
		//pop = 2147483648; //The literal 2147483648 of type int is out of range 
				
		pop = 2147483648L;
		System.out.println("world population = " + pop);
	}
}
