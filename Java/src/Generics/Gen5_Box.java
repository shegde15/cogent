package Generics;
 

 
/*
A generic class declaration looks like a non-generic class 
declaration,except that the class name is followed by a 
type parameter section.

*/

import java.util.*;

public class Gen5_Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
     Gen5_Box<Integer> integerBox = new Gen5_Box<Integer>();
     Gen5_Box<String> stringBox = new Gen5_Box<String>();
    
     integerBox.add(new Integer(10));
     stringBox.add(new String("Hello World"));

     System.out.printf("Integer Value :%d\n\n", integerBox.get());
     System.out.printf("String Value :%s\n", stringBox.get());
  }
}