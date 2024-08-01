class Account {
	void deposit(){
		System.out.println("inside Account");
	}
}

class SavingsAccount extends Account {
	@Override
	void deposit(){
		System.out.println("inside Savings Account");
	}
}

class CurrentAccount extends Account {
	@Override
	void deposit(){
		System.out.println("inside Current Account");
	}
}

class Polymorphism1 
{
	public static void main(String[] args) 
	{
		Account acc = null;

		Account accObj = new Account();
		SavingsAccount sAccObj = new SavingsAccount();
		CurrentAccount cAccObj = new CurrentAccount();

		//acc = new Account();
		//acc = accObj;
		//acc = sAccObj;
		acc = cAccObj;

		acc.deposit();

		System.out.println("acc instanceof java.lang.Object --> " + (acc instanceof java.lang.Object));
		System.out.println("acc instanceof Account --> " + (acc instanceof Account));				
		System.out.println("acc instanceof SavingsAccount --> " + (acc instanceof SavingsAccount));
		System.out.println("acc instanceof CurrentAccount --> " + (acc instanceof CurrentAccount));
	}
}
