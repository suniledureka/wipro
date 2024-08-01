
public class LiteralsTest {

	public static void main(String[] args) {
		//integerLiterals();
		characterLiterals();		
	}

	private static void characterLiterals() {
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit type-casting
		System.out.println(c);
		System.out.println(Integer.toHexString(65));
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905';
		System.out.println(c);
		
		c = '\u0c05';
		System.out.println(c);
		
		c = '\u0d05';
		System.out.println(c);
	}

	private static void integerLiterals() {
		System.out.println(12);
		System.out.println(012);
		System.out.println(Integer.toOctalString(10));
		System.out.println(0x12);
		System.out.println(Integer.toHexString(18));
		System.out.println(0b11);
		System.out.println(Integer.toBinaryString(3));
		
		int n = 011 + 012;
		System.out.println(n); //9 + 10 - 19
		System.out.println("-".repeat(100));		
	}

}
