package com.collections;

//Pre-JDK 1.5
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPreJava5 {
public static void main(String[] args) {
   List lst = new ArrayList();  // A List contains instances of Object. Upcast ArrayList to List
   lst.add("apple");            // add() takes Object. String upcast to Object implicitly
   lst.add("orange");
   lst.add("strawberry");
   System.out.println(lst);     // [apple,orange,strawberry]

   // Get a "iterator" instance from List to iterate thru all the elements of the List
   Iterator iter = lst.iterator();
   while (iter.hasNext()) {      // any more element
      // Retrieve the next element, explicitly downcast from Object back to String
      String str = (String)iter.next();
      System.out.println(str);
   }
}
}