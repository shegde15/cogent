package com.exception;
class Throw_Demo
{
    public static void test1()
    {
        try
        {
            System.out.println("Before test2");
            test2();
        }
        catch(ArrayIndexOutOfBoundsException j) //manually thrown object catched here
        {
            System.out.println("J : " + j)  ;
        }
         
    }
     
    public static void test2()
    {
        int a=5,b=0;
        try
        {
            System.out.println("We r in test2");
            System.out.println("********");
            int x = a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("c : " + e);
            throw new ArrayIndexOutOfBoundsException("demo");   //throw from here
        }
    }
     
    public static void main(String args[])
    {
     
        try
        {
            System.out.println("Before test1"); 
            test1();
            System.out.println("********");
            System.out.println("After test1");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Main Program : " + e);
        }
    }
}