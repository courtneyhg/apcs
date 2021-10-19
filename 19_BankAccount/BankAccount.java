/*
TNPG: Vegan Dragons (Andrew Piatesky, Anjini Katari, Courtney Huang)
APCS
HW 19 -- Mo Money Mo Problems ...MORE AWESOME 
2021-10-18


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
			System.out.println("Invalid pin");
		}
		
		// The account number should only be set to a 9 digit number (interval [100000000, 999999998])
		Balance = initAmount;
		if (accNumber >= 100000000 && accNumber <=999999998) {
			AccountNumber = accNumber;
		}
		else{
			AccountNumber = 999999999;
			System.out.println("Invalid account number");
		}
	}

	public void ShowInfo(String name, String pwd) {
		System.out.println("FullName: " + FullName);
		System.out.println("Password: " + Password);
		System.out.println("PIN: " + PIN);
		System.out.println("Acc number: " + AccountNumber);
		System.out.println("Balance: " + Balance + "\n");
	}

	public double Deposit(int pin, double amount){
		Balance += amount;
		return Balance;
	}
 	 
	// If the account does not ahve enough money, nothing is changed. An error message is printed and false is returned.
	// If the account does have enough money, then the amount is deducted and true is returned.
	public boolean Withdraw(int pin, double amount){
		if (amount > Balance){
			System.out.println("You do not have enough money");
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
		BankAccount joshAccount = new BankAccount("Josh Davis","password", 1234, 1000, 123456789);

		joshAccount.Deposit(1234, 400.52);
		joshAccount.ShowInfo("Josh Davis","password");
		joshAccount.Withdraw(1234, 800.87);
		joshAccount.ShowInfo("Josh Davis","password");

		//Bob's account and credentials
		BankAccount bobAccount = new BankAccount("Bob Dylan", "123", 0001, 200, -10);

		bobAccount.Deposit(5678, 99.25);
		bobAccount.ShowInfo("Bob Dylan", "123");
		bobAccount.Withdraw(0001, 590.99);
		bobAccount.ShowInfo("Bob Dylan", "123");

	}
}
*/
public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if (newPin >= 1000 && newPin <= 9998){
	    newPin = pin;
    } else{
	    pin = 9999;
	    System.out.println("Invalid pin");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
     int oldAcctNum = acctNum;
     if (newAcctNum >= 100000000 && newAcctNum <=999999998) {
	     acctNum = newAcctNum;
     } else{
	     acctNum = 999999999;
	     System.out.println("Invalid account number");
     }
  }
	return oldAcctNum;
}

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
	  if (withdrawAmount > balance){
		  System.out.println("You do not have enough money");
		  return false;
	  } else{
		  Balance -= amount;
		  return true;
	  }
  }

public boolean authenticate(int newAcctNum, String newPasswd){
	if (newAcctNum >= 100000000 && newAcctNum <=999999998){
		return true;
	}
	else{
		return false;
	}
}

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
	  BankAccount ba = new BankAccount();
	  ba.toString();
	  
  }//end main()

}//end class BankAccount

/*
Discoveries: We must use && for "and" if we want both statements to be true in the if statement.

Questions: Why does it not show that Bob Dylan has an invalid pin and invalid account number when I do bobAccount.ShowInfo again after withdrawing money?
*/
