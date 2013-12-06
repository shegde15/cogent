package com.exception;
import java.lang.Exception;
 
class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
 
}
class TestMyException
{
    public static void main(String[] args) 
    {
        int x = 5, y = 1000;
        try
        {
            float z = (float)x / (float)y;
            if(z < 0.01)
            {
                throw new MyException("Number is too small");
            }
        }
        catch(MyException e)
        {
            System.out.println("Caught MyException");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Don't worry about exception thrown or not");
        }
    }
}