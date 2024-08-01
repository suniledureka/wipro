class A {
	void display(){
		System.out.println("inside class A");
	}
}

class B extends A {
	void display(){
		System.out.println("inside class B");
	}
}


class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
	}
}
