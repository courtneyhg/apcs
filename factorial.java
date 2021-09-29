import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
      int n;
      Scanner in = new Scanner(System.in);
      System.out.print("Input a value for n: ");
      n = in.nextInt();
      System.out.println("The factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n){
        int i;
        if (n == 0) {
            return 1;
        }
        else {
            for(i = n-1; i >= 1; i--){
            n = n * i;
        }
            return n;
        }
    }
}
