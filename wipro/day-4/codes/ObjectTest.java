class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Praveen Kumar";
		sal = 2750.50f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}	
}

public class ObjectTest{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();

		//accessing the properties of an object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//accessing the properties of an object using reference & method
		emp.getDetails();

		//change the state of object using reference
		emp.empno = 101;
		emp.name = "Praveen";
		emp.sal = 2500f;

		emp.getDetails();
		
		//change the state of object using reference & method
		emp.setDetails();
		emp.getDetails();
	}
}
