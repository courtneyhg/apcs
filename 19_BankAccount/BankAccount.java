/*
TNPG: Vegan Dragons (Andrew Piatesky, Anjini Katari, Courtney Huang)
APCS
HW 19 -- Mo Money Mo Problems ...MORE AWESOME 
2021-10-18
*/

public class BankAccount {
	
	private String FullName;
	private String Password;
	private int PIN;
	private int AccountNumber;
	private double Balance;
	
	//Overloaded constructor, no default one because need to make account by default.
	public BankAccount(String name, String pwd, int pin, double initAmount, int accNumber) {
		FullName = name;
		Password = pwd;
		PIN = pin;
		if (pin >= 1000 && pin <= 9998){
			pin = PIN;
		}
		else{
			PIN = 9999;
			System.out.println("invalid pin");
		}
		Balance = initAmount;
		if (accNumber >= 100000000 && accNumber <=999999998) {
			AccountNumber = accNumber;
		}
		else{
			AccountNumber = 999999999;
			System.out.println("invalid account number");
		}
	}

	public void ShowInfo(String name, String pwd) {
		System.out.println("FullName: " + FullName);
		System.out.println("Password: " + Password);
		System.out.println("PIN: " + PIN);
		System.out.println("Acc number: " + AccountNumber);
		System.out.println("Balance: " + Balance);
	}

	public double Deposit(int pin, double amount){
		Balance += amount;
		return Balance;
	}

	public boolean Withdraw(int pin, double amount){
		if (amount > Balance){
			System.out.println("You have don't have enough money");
			return false;
		}
		else{
			Balance -= amount;
			return true;
		}
	}
	
	public boolean authenticate(int accNumber, String pwd){
		if (accNumber >= 100000000 && accNumber <=999999998){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main (String[] args) {
		System.out.println("It works!!");
		BankAccount joshAccount = new BankAccount("Josh Davis","password",1234,1000,123456789);

		//joshAccount.Deposit(1234,4000.50);
		//joshAccount.ShowInfo("Josh Davis","password");
		joshAccount.Withdraw(1234,800);
		joshAccount.ShowInfo("Josh Davis","password");

		//Bob's account and credentials
		BankAccount bobAccount = new BankAccount("Bob Dylan","123",0001,20000.75,-10);

		bobAccount.Deposit(5678,99.25);
		bobAccount.ShowInfo("Bob Dylan","123");
		bobAccount.Withdraw(0001,25000.50);

	}
}


/*
Discoveries: 
*/
