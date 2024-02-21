public class BankAccount {
     private double balance;
     
	
	public BankAccount(double initialbalance) {
		this.balance = initialbalance;
	}
	public double getBalanace() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Deposit successful.New balance : $"+balance);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount) {
		if(amount >0 && amount <=balance) {
			balance -=amount;
			System.out.println("Withdraw successful. New balanace : $"+balance);
		}else {
			System.out.println("Invalid withdraw amount or insufficient funds.");
		}
	}
}