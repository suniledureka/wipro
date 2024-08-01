//final class A{
class A{
	final void display(){}
}

class B extends A {
	void display(){}
}

class FinalTest 
{
	//final FinalTest(){} //error: modifier final not allowed here

	final String name; //blank final variable
	
	FinalTest(){
		name = "Wipro";
	}

	final int n = 12; //instance variable

	public static void main(String[] args) 
	{
		final int n = 12; //local variable
		//n = 13; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 12; //error: cannot assign a value to final variable n
	}
}
