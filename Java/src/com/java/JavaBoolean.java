package com.java;

public class JavaBoolean {
	 
    public static void main(String[] args) {
           
            /*
             * boolean is simple Java type which can have only of two values; true or false.
             * All rational expressions retrun this type of value.
             *
             * Declare boolean varibale as below
             *
             * boolean <variable name> = <default value>;
             *
             * here assigning default value is optional.
             */

            boolean b1 = true;
            boolean b2 = false;
            boolean b3 = (10 > 2)? true:false;
           
            System.out.println("Value of boolean variable b1 is :" + b1);
            System.out.println("Value of boolean variable b2 is :" + b2);
            System.out.println("Value of boolean variable b3 is :" + b3);            
    }
}

