import java.util.Scanner;
public class isDivisible{
  public static void main(String[] args){
    int n;
    int m;
    Scanner in = new Scanner(System.in);
    System.out.print("Input a value for n: ");
    n = in.nextInt();
    System.out.print("Input a value for m: ");
    m = in.nextInt();
    if (n % m == 0){
      System.out.print("true");
    } else {
      System.out.print("false");
    }
  }
}
