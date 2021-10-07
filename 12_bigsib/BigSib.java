// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<12> -- <On Elder Individuality and the Elimination of Radio Fuzz>
// <2021>-<10>-<05>

// DISCO
// Both are strings

// QCC
// I keep getting the error message "error: cannot find symbol" "symbol: variable greeting" "location: class Greet"

 public class BigSib{
	String HelloMsg;
 
	public void setHelloMsg(String msg){
		 HelloMsg = msg;
	}
	public String greet(String name){
		return (HelloMsg + " " +  name);
	}

}
