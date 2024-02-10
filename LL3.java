import java.util.*;
public class LL3 {
    public static void main(String a[])
    {
      LinkedList<Integer> list=new LinkedList<>();
      list.addFirst(5);
      list.addFirst(4);
      list.addFirst(3);
      list.addFirst(2);
      list.addFirst(1);
      System.out.println(list);
      list.remove(4);
      System.out.println(list);

    }
    
}
