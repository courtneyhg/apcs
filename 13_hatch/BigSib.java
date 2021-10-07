// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<12> -- <Where do BigSibs come from?>
// <2021>-<10>-<06>

// DISCO
// A constructor must be public and it is the 1st method definition

// QCC
// I keep getting the error message "error: cannot find symbol" "symbol: variable greeting" "location: class Greet"

 public class BigSib{
  String HelloMsg;
  
  public BigSib(String z){
   setHelloMsg(z);
  }
  
  public void setHelloMsg(String y) {
   HelloMsg = y;
  }
  public String greet(String x) {
   return (HelloMsg + " " + x);
   }
}
