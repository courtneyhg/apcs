import java.util.Scanner;
public class power{
  public static void main(String[] args){
    double x;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Input a value for x: ");
    x = in.nextDouble();

    System.out.print("Input a value for n: ");
    n = in.nextInt();
    System.out.println(power(x, n));
  }
  public static double power(double x, int n){
        int i;
        double y;
        if (n == 0)  {
            return 1;
        }
        else if (n > 0) {
            y = x;
            for (i = 1; i <= n-1; i = i+1) {
                y = x * y;
            }
            return y;
        }
        else {
            y = 1/x;
            n = -1 * n;
            for (i = 1; i <= n-1; i = i+1) {
                y = (1/x) * y;
            }
            return y;
        }
    }
}

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
