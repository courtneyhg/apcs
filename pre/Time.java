public class Time{
  public static void main(String[] args){
    int minute = 51;
    int hour = 21;
    int second = 24;
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");

    System.out.print("Number of seconds since midnight: ");
    System.out.println((hour * 60 + minute) * 60);

    System.out.print("Number of seconds remaining in the day: ");
    System.out.println(((24 - hour) * 60 - minute) * 60);

    System.out.print("Percentage of the day that has passed: ");
    System.out.println(((hour * 3600 + minute * 60 + second) * 100) / 86400);

    System.out.print("Elapsed time since I started working on this exercise: ");
    System.out.print(hour - 21);
    System.out.print(" hours and ");
    System.out.print(minute - 10);
    System.out.print(" minutes");
  }
}
