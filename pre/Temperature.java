import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
  double celsius;
  double fahrenheit;
  Scanner in = new Scanner(System.in);

  System.out.print("What is the temperature in celsius?: ");
  celsius = in.nextInt();
  System.out.print("Let's find the temperature in fahrenheit! ");
  fahrenheit = celsius * 9 / 5 + 32;
  System.out.println(" ");
  System.out.printf(celsius + " C = " + fahrenheit + " F");
    }
}
