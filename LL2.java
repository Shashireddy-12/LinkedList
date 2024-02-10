// linkedlist using collections
import java.util.*;
public class LL2
{
public static void main(String a[])
{
    LinkedList<String> list=new LinkedList<>();
    list.addFirst("a");
    list.addFirst("is");
    list.addFirst("list");
    System.out.println(list);
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
    System.out.println(list.get(0));
    for(int i=0;i<list.size();i++)
    {
        System.out.print(list.get(i)+"-->");
    }
    System.out.println("NULL");





}
}