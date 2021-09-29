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
