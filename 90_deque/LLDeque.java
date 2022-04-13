import java.util.LinkedList;
public class LLDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> mouse;

  public LLDeque() {
    mouse = new LinkedList<QUASAR>();
  }

  public void addLast(QUASAR x){
    mouse.addLast(x);
  }


  public void addFirst(QUASAR x){
    mouse.addFirst(x);
  }

  public QUASAR removeLast(){
    return mouse.removeLast();
  }

  public QUASAR removeFirst(){
    return mouse.removeFirst();
  }

  public QUASAR peekFirst(){
    return mouse.peekFirst();
  }

  public QUASAR peekLast(){
    return mouse.peekLast();
  }

  public int size(){
    return mouse.size();
  }

  public static void main(String[] args) {
      LLDeque test = new LLDeque();
      test.addLast( "first" );
      test.addLast( "second" );
      test.addLast( "third" );
      test.addLast( "fourth" );
      test.addLast( "fifth" );
      test.addLast( "sixth" );

      System.out.println("Peek first: " + test.peekFirst());
      System.out.println("Peek last: " + test.peekLast());

      System.out.println("removing last: " + test.removeLast());
      System.out.println("removing first: " + test.removeFirst());

      System.out.println("Peek first: " + test.peekFirst());
      System.out.println("Peek last: " + test.peekLast());

      test.addFirst("surprise");
      System.out.println("Peek first: " + test.peekFirst());

    }
}
