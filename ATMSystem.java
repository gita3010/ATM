import java.util.Scanner;
public class ATMSystem {

	public static void main(String[] args) {
		
		BankAccount userAccount=new BankAccount(1000);
		
		//create ATM instance connected to the users bank account
		ATM atm=new ATM(userAccount);
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			atm.displayMenu();
			
			System.out.println("Enter option (1-4) :");
			int option =sc.nextInt();
			atm.handleOption(option);
            sc.close();
		}
        
	}

}