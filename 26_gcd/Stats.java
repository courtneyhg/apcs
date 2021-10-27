public class Stats {
	public static void main (String [] args){
		System.out.println(gcd(15, 18));
		System.out.println(gcd(4, 24));
		System.out.println(gcd(21, 14));
		System.out.println(gcd(5, 5));
	}
	
	// "brute force" approach beginning at 1 and working up to lesser input
	public static int gcd(int a, int b){
		int answer = 1;
		while ((answer < a) && (answer < b)){
			if ((a%answer==0) && (b%answer==0)){
				answer += 1;
			}
			else if (answer == a || answer == b){
			return answer;
			}
			
		}
		return answer;
	}
	
	// recursive algorithmn
	//public static int gcdER(int a, int b){
	//}
	
	// while-looped based iterative algotitmn
	public static int gcdEW(int a, int b){
		int counter;
		if (a == b){
		return a;
		}
		else if (a > b){
		counter = (a-b);
		}
		else{
		counter = (b-a);
		}
		
		while (1 < counter){
			if ((a%counter==0) && (b%counter==0)){
			return counter;
			}
			counter -= 1;
			}
			return counter;
	}
}
