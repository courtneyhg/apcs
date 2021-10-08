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
