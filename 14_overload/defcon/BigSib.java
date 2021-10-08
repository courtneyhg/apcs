// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<12> -- <Customize Your Creation>
// <2021>-<10>-<07>

// DISCO
// I used the string hi to customize the constructor's actions.

// QCC
// I keep getting the error message "Error: Main method not found in class BigSib, please define the main method as: public static void main(String[] args)"

 public class BigSib{
  String hi;
  public BigSib () {
   hi = "hellooo";
  }
  
  public String greet(String x) {
   return hi + " " + x;
   }
}
