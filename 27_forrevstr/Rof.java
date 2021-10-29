public class Rof {

	public static void main (String [] args) {
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(3));

    		System.out.println(reverseF("stressed"));
		/*
		// basic example of a while loop converted into a for loop:
			int x = 0;
			while (x < 4) {
				System.out.println( x);
				x++;
			}

			for (int i = 0; i <4; i++) {
			System.out.println(i);
			}
			*/
		}

	// takes non-negative integer posts, returns a String representation of a fence with the specified number of posts. Uses a FOR loop.
	public static String fenceF (int posts){
		String fence = "";
		for (int x = 0; x < posts; x++){
			if (x == 0) fence += "|";
			else fence += "--|";
		}
		return fence;
	}

	// a non-empty String s and returns s with its letters reversed. Uses a FOR loop.
	public static String reverseF (String s) {
		String reverse = "";
		for (int length = s.length(); length > 0; length--) {
		  reverse += s.substring(length-1, length);
		}
		return reverse;
	  }
}
