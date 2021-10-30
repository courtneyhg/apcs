/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

/*
Mochi Yoshi - Yuki Feng, Courtney Huang
APCS
HW 24: Get It While You Can
2021-10-25
Time spent: 1 hour */

/*
QCC:

DISCO:
*/

public class Driver {

  public static void main( String[] args ) {
	  

    //build Objects from blueprint specified by class Coin

/*
    //test default constructor
    //===================TOP==========================
    Coin mine = new Coin();

      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );

      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
	  
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("After flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      */
	  
      //hw24
	Coin bob = new Coin("dime" , "tails");
	Coin jeff = new Coin("nickel" , "heads");
	  
	      int x = 0;
	      int y = 0;
	      int z = 0;
	  
	  while (x < 10) {
	      bob.flip();
	      if (bob.getUpFace().equals("heads")){
		      x += 1;
	      }
      }
	  
	  while (y < 22) {
	      bob.flip();
	      if (bob.equals(jeff)){
		      y += 1;
	      }
      }
	  
	  while (z < 65536) {
		  bob.flip();
		  jeff.flip();
		  if ((z%2005 == 0) && (bob.equals(jeff)){
			  z+=1;
		  }
	  }
	  
	System.out.println("Heads: " + bob.getHeadsCtr());
	System.out.println("Matches: " + y);
	System.out.println("At least 65536 and divisible by 2005: " + z);

      // ====================BOTTOM======================*/

  }//end main()

}//end class
