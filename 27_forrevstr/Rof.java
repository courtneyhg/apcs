public class Rof {

	public static void main (String [] args) {
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(3));
		/*
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
	
	public static String fenceF (int posts){
		String fence = "";
		for (int x = 0; x < posts; x++){
			if (x == 0) fence += "|";
			else fence += "--|";
		}
		return fence;
	}
}
	
	
	
	
