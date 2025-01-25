interface Bank
{
	int n = 25; //public static final

	void deposit(float amt); //public abstract
	//default void withdraw(float amt){}
	
	void withdraw(float amt); //public abstract
}