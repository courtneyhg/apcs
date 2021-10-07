// <Courtney Huang and Timothy, Yat Long>
// APCS
// HW<13> -- <Where do BigSibs come from?>
// <2021>-<10>-<06>

// DISCO
// I repeated the same steps with all the lines of output that I wanted

// QCC
// Why do we name it richard and why did we need to create a new BigSib();?

public class Greet {
  public static void main (String[] args) {
    String greeeting;
    
    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib spaceman = new BigSib();
    spaceman.setHelloMsg("Salutations");

    greeting = spaceman.greet("Dr.Spaceman");
    System.out.println(greeting);
    
    BigSib fooey = new BigSib();
    fooey.setHelloMsg("Hey ya");

    greeting = fooey.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib mom = new BigSib();
    mom.setHelloMsg("Sup");

    greeting = mom.greet("mom");
    System.out.println(greeting);
  }
}
