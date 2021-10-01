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



public class Chapter7exercise5 {
    public static void main(String[] args) {

      for (double i = 0.1; i <= 100.0; i = i*10.0){
        check(i);
      }
      for (double i = -0.1; i >= -100.0; i = i*10.0){
        check(i);
      }
    }
    public static double myexp(double x, double n){
      double y=1;
      double total=1;
      double numerator=1;
      for (int i = 1; i < n; i++){
        for (int j = 1; j <= n-1; j = j+1) {
            numerator = x * numerator;
        }
        y = numerator/factorial(i);
        total += y;
      }
      return total;
    }

    public static double factorial(double n){
        double i;
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
    public static void check(double x){
      double n = 5;
      double y;
      double total;
      System.out.println(x + "\t \t" + myexp(x, n) + "\t \t" + Math.exp(x));
    }
}
