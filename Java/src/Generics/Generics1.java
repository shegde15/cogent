package Generics;
import java.util.ArrayList;
import java.util.List;

public class Generics1 {

  public static void main(String[] args) {
    List  stringList1 = new ArrayList();
    stringList1.add (12);
    stringList1.add (23);
    stringList1.add(1000,"test");

    Object s1 = stringList1.get (1);
   //  Integer i1=stringList1.get(2);

//    String s1 = (String) stringList1.get (1);
    System.out.println(s1);
 //   System.out.println(i1);
    
  }

}