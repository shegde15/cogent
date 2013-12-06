package com.streams;
import java.io.*;
class filein
{
    public static void main(String arg[])throws IOException
    {
  
	   int s;
        InputStream f=new FileInputStream("D:\\Test.java");
        s=f.available();
        System.out.println("Total available bytes "+s);
   
        System.out.println("First"+s+"bytes of the file one read() at a time");
        for(int i=0;i<s;i++)
        {
            System.out.print(f.read());
        }
 
        
    }
}
