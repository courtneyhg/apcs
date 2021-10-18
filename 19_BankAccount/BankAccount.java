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
		
		// PIN should only be set to a 4 digit number (some value betweem 1000 and 9998)
		PIN = pin;
		if (pin >= 1000 && pin <= 9998){
			pin = PIN;
		}
		else{
			PIN = 9999;
			System.out.println("invalid pin");
		}
		
		// The account number should only be set to a 9 digit number (interval [100000000, 999999998])
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
		return ("\n");
	}

	public double Deposit(int pin, double amount){
		Balance += amount;
		return Balance;
	}
 	 
	// If the account does not ahve enough money, nothing is changed. An error message is printed and false is returned.
	// If the account does have enough money, then the amount is deducted and true is returned.
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
		//Josh's account and credentials
		BankAccount joshAccount = new BankAccount("Josh Davis","password",1234,1000,123456789);

		joshAccount.Deposit(1234,400);
		joshAccount.ShowInfo("Josh Davis","password");
		joshAccount.Withdraw(1234,800);
		joshAccount.ShowInfo("Josh Davis","password");

		//Bob's account and credentials
		BankAccount bobAccount = new BankAccount("Bob Dylan","123",0001,200,-10);

		bobAccount.Deposit(5678,99.25);
		bobAccount.ShowInfo("Bob Dylan","123");
		bobAccount.Withdraw(0001,250);
		bobAccount.ShowInfo("Bob Dylan", "123");

	}
}


/*
Discoveries: 
*/
