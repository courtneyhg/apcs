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

public class indexOfMax{
  public static void main(String[] args){
    int[] array1 = {8, 45, 83, 23, 99};
    System.out.println(sort(array1));

}
  public static int sort(int[] array1){
    int index=0;
    for (int i=0; i < array1.length; i++) {
      if (array1[i] > array1[index]){
        index = i;
      }
    }
    return index;
  }
}

public class sieve{
  public static void main(String[] args){
    System.out.println(sieve(20));
  }

  public static boolean[] sieve(int n){
    boolean[] a = new boolean[a + 1];
    for (int i = 0; i <= n; i++)
    a[i] = true;

    for (int p = 2; p * p <= n; p++){
            if (a[p] == true){
                for (int i = p * p; i <= n; i += p)
                    a[i] = false;
                  }
                }
                for (int i = 2; i <= n; i++){
                  if (a[i] == true)
                  System.out.print(i + " ");
                }
            }
          }
