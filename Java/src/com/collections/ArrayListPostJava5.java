package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListPostJava5 {
   public static void main(String[] args) {
      List<String> lst = new ArrayList<String>();  // Inform compiler about the type
      lst.add("alpha");         // compiler checks if argument's type is String
      lst.add("beta");
      lst.add("gamma");
      System.out.println(lst);  // [alpha, beta, gamma]
 
      Iterator<String> iter = lst.iterator();   // Iterator of Strings
      while (iter.hasNext()) {
         String str = iter.next();  // compiler inserts downcast operator
         System.out.println(str);
      }
 
//      lst.add(new Integer(1234));   // ERROR: compiler can detect wrong type
//      Integer intObj = lst.get(0);  // ERROR: compiler can detect wrong type
 
      // Enhanced for-loop (JDK 1.5)
      for (String str : lst) {
         System.out.println(str);
      }
   }
}