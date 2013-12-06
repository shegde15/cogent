package annotation;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import java.util.List;

 

public class MethodInfoExample {

  

    public static void main(String[] args) {
    MethodInfoExample mi=new MethodInfoExample();
     
    mi.oldMethod();
    try{
    mi.genericsTest() ;
    }catch(Exception e){}
    
    }

 

    @Override

    @MethodInfo(author = "Saran", comments = "Main method", date = "Sep 02 2013", revision = 1)

    public String toString() {

        return "Overriden toString method";

    }

 

    @Deprecated

    @MethodInfo(comments = "deprecated method", date = "Sep 10 2013",revision=5)

    public static void oldMethod() {

        System.out.println("old method, don't use it.");

    }

 

    @SuppressWarnings({ "unchecked', 'deprecation" })

    @MethodInfo(author = "Ping", comments = "Main method", date = "Sep 23 2013", revision = 10)

    public static void genericsTest() throws FileNotFoundException {

        List l = new ArrayList();

        l.add("abc");

        oldMethod();

    }

 

}

