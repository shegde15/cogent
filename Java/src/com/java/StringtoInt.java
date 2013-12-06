package com.java;

public class StringtoInt {
    public static void main(String args[]){
           
            //int variable
            int i = 11;
           
            /*
             * To convert int to String, use
             * toString(int i)
             * method of Integer wrapper class.
             */
            String str = Integer.toString(i);
           
            System.out.println("int to String : " + i);
    }
}
