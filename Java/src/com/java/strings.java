package com.java;

public class strings {
    public static void main(String[] args) {
    	
    	char c='d';
    	char d[]={'a','b','c'};
           // declare and initialize variables and objects
           int i = 25;
           String s = new String("Java is fun!");
           StringBuffer sb = new StringBuffer("Hello, world");
          

           // print variable i and objects s and sb
           System.out.println("localvar"+i);     // print it (1)
           System.out.println("localstring"+s);    // print it (2)
           System.out.println("localstringbuffer"+sb);  // print it (3)

           // attempt to change i, s, and sb using methods
           iMethod(i);
           sMethod(s);
           sbMethod(sb);

            // print variable i and objects s and sb (again)
            System.out.println(i);    // print it (7)
            System.out.println(s);   // print it (8)
            System.out.println(sb); // print it (9)


    }

    public static void iMethod(int iTest) {
           iTest = 9;                          // change it
           System.out.println("defined imethod"+iTest); // print it (4)
           return;
    }

    public static void sMethod(String sTest) {
    	      String s1="Hello";
    	      String s2=new String("Hello");
    	      
    	      if(s1==s2){
    	    	  
    	    	  System.out.println("true");
    	      }
    	      else{
    	    	  System.out.println("false");
    	    	  
    	      }
    	      if(s1.equals(s2)){
    	    	 System.out.println("true");
    	    	 
    	      }
    	      
    	      else{
    	    	  System.out.println("false");
    	      }
    	    	  
           sTest = sTest.substring(8, 11); // change it
          System.out.println("defined smethod"+sTest);        // print it (5)
           return;
    }

    public static void sbMethod(StringBuffer sbTest) {
           sbTest = sbTest.insert(7, "Java "); // change it
         System.out.println("defined sbmethod"+sbTest);            // print it (6)
           return;
     }
}


