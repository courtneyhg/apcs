// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<12> -- <Customize Your Creation>
// <2021>-<10>-<07>

// DISCO
// I gave HelloMsg a value so when greet is run it returns the HelloMsg and String x.

// QCC
// I keep getting the error message "Error: Main method not found in class BigSib, please define the main method as: public static void main(String[] args)"

public class BigSib{
  String HelloMsg;
  public BigSib () {
   HelloMsg = ("Word up");
  }
  
  public void setHelloMsg(String y) {
   HelloMsg = y;
  }
  public String greet(String x) {
   return (HelloMsg + " " + x);
   }
}
