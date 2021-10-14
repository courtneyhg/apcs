// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<13> -- <Where do BigSibs come from?>
// <2021>-<10>-<06>

// DISCO
// I repeated the same steps with all the lines of output that I wanted

// QCC
// Why do we name it richard and why did we need to create a new BigSib();?

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
   // richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
