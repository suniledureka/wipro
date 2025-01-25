import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Bank bank = null;

		System.out.print("which bank's card is this? [1.SBI | 2. ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;				
			default:
				System.out.println("Card Read Error... TRY Again");
			    return; //System.exit(0);
		}//switch

		System.out.println("\n============ WELCOME TO " + bank.getClass().getSimpleName() + " ============\n");
		bank.deposit(1000);
		bank.withdraw(500);
		
		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);

		//bank.n = 25; //error: cannot assign a value to final variable n
		sc.close();
	}
}
