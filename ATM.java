import java.util.Scanner;
public class ATM {
	private BankAccount userAccount;
	public ATM(BankAccount userAccount) {
		
		this.userAccount=userAccount;
	}
	public void displayMenu()
	{
		System.out.println("\n-----ATM MENU----");
		System.out.println("1.Check balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
	}
	
	public void handleOption(int option) {
		Scanner sc=new Scanner(System.in);
		
		switch(option) {
		case 1:
			System.out.println("Balance :$"+userAccount.getBalanace());
			break;
			
		case 2:
			System.out.println("Enter deposit amount :$");
			double depositAmount=sc.nextDouble();
			userAccount.deposit(depositAmount);
			break;
			
		case 3:
			System.out.println("Enter  withdraw amount :$");
			double withdrawAmount=sc.nextDouble();
			userAccount.withdraw(withdrawAmount);
			break;
			
		case 4:
			System.out.println("Exiting . \n---------Thank you--------");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid option. Please try again");
		}
        sc.close();
	}

}