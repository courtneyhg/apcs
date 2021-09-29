import java.util.Arrays;

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
