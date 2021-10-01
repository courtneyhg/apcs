import java.util.Scanner;
public class ack{
  public static void main(String[] args){
    int n;
    int m;
    Scanner in = new Scanner(System.in);
    System.out.print("Input a value for n: ");
    n = in.nextInt();
    System.out.print("Input a value for m: ");
    m = in.nextInt();

    if (m == 0){
      System.out.print(n + 1);
    } else if ((m > 0) && (n == 0)){
      System.out.print("A(" + (m - 1) + ", 1)");
    } else if ((m > 0) && (n > 0)){
      System.out.print("A(" + (m - 1) + ", A(" + m + ", " + (n - 1) + "))");
    } else {
      System.out.print(n + 1);
    }
  }
}
