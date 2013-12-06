package com.java;

public class ArithmeticAssignment {
	 
    public static void main(String[] args) {
           
            /*
             * Java provides short cut operators to combine an Arithmetic
             * operator and assignment operator.
             *
             * For example,
             *
             * i = i + 5;
             *
             * can also be rewritten as
             *
             * i+= 4;
             */
             
             int i = 5;
             int j = 10;
             
             i += 5; //same as i = i + 5
             j -= 2; //same as j = j - 2
             
             System.out.println("i = " + i);
             System.out.println("j = " + j);
           
    }
}
