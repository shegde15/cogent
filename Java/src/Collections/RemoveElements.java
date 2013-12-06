package Collections;

import java.util.LinkedList;

public class RemoveElements {
  public static void main(String[] arr) {
String ss=new String("E");

    LinkedList list = new LinkedList();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.addFirst("X");
    list.addLast("Z");

    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    
    list.add(2,ss);
     


    list.removeFirst();
    list.removeLast();

    System.out.println(list);
  }
}