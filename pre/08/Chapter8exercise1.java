import java.util.Arrays;

public class Chapter8exercise1{
  public static void main(String[] args){
    double[] a = {3, 5, 6, 4, 9};
    int [] b = {45, 57, 8, 34, 59, 3, 0};
    System.out.println(Arrays.toString(powArray (a)));
    System.out.println(Arrays.toString(histogram (b, 5)));
  }

  public static double[] powArray(double[] a) {
      for (int i = 0; i < a.length; i++) {
        a[i] = Math.pow(a[i], 2);
      }
      return a;
    }

    public static int[] histogram(int[] array, int count) {
      int[] counts = new int[count-1];
      for (int element : array) {
          counts[element]++;
        }
        return counts;
  }

}
