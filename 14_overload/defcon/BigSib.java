// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<12> -- <Customize Your Creation>
// <2021>-<10>-<07>

// DISCO
// A constructor must be public and it is the 1st method definition

// QCC
// I keep getting the error message "error: cannot find symbol" "symbol: variable greeting" "location: class Greet"

 public class BigSib{
  String hi;
  public BigSib () {
   hi = ("hellooo");
  }
  
  public String greet(String x) {
   return (hi + " " + x);
   }
}
