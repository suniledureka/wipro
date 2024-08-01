
public class FloatType {

	public static void main(String[] args) {
		//float sal = 2500.50; //Type mismatch: cannot convert from double to float
		//float sal = 2500.50f;
		//float sal = 2500.5F;
		float sal = (float)2500.50;
		System.out.println("my salary = " + sal);
		
		System.out.println(String.format("%f", sal));
		System.out.println(String.format("%.2f", sal));
		
		System.out.printf("%.2f\n", sal);
		
		System.out.println(10f/3);
		System.out.println(10d/3);
	}

}
