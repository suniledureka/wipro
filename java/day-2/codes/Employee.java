class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Sanjay Patil";
		sal = 80000.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		//create an instance/ object of Employee type
		Employee emp = new Employee();

		//access the state of an object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//access the state of an object using reference and method
		emp.getDetails();

		//change the state of an object using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 75000f;

		emp.getDetails();

		//change the state of an object using reference and method
		emp.setDetails();
		emp.getDetails();
	}
}
