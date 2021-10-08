public class BigSib{

   String helloMsg;

   public BigSib() {
      helloMsg = "Word up";
  }

   public BigSib(String str) {
      helloMsg = str;
  }

   public void setHelloMsg(String str) {
       helloMsg = str;
  }

   public String greet(String str) {
       return helloMsg + " " + str;
  }
}
