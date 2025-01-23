class A {
	void display(){
		System.out.println("in class A");
	}
}

class B extends A{
	void display(){
		System.out.println("in class B");
	}
}

class C extends A{
	void display(){
		System.out.println("in class C");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		A obj;
		
		/*
		obj = new A();
		obj.display();
		*/
		
		/*
		obj = new B();
		obj.display();
		*/

		obj = new C();
		obj.display();

		System.out.println("obj instance of A = " + (obj instanceof A));
		System.out.println("obj instance of B = " + (obj instanceof B));
		System.out.println("obj instance of C = " + (obj instanceof C));
	}
}
