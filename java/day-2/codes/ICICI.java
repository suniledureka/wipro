class ICICI implements Bank 
{
	public void deposit(float amt){
		System.out.println("Rs." + amt + " Credited to ICICI Account");
	}

	public void withdraw(float amt){
		System.out.println("Rs." + amt + " Debited from ICICI Account");
	}
}
