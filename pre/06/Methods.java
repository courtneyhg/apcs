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

public class isTriangle{
  public static void main(String[] args){
    int side1;
    int side2;
    int side3;
    Scanner in = new Scanner(System.in);
    System.out.print("Input the length of one side of the triangle: ");
    side1 = in.nextInt();
    System.out.print("Input the length of the second side of the triangle: ");
    side2 = in.nextInt();
    System.out.print("Input the length of the third side of the triangle: ");
    side3 = in.nextInt();

    if ((side1 + side2) < side3){
      System.out.print("false");
    } else if ((side2 + side3) < side1){
      System.out.print("false");
    } else if ((side3 + side1) < side2){
      System.out.print("false");
    } else {
      System.out.print("true");
    }
  }
}

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
