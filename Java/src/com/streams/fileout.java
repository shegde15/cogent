package com.streams;
import java.io.*;
public class fileout
{
    public static void main(String arg[])throws IOException
    {
        String s="Welcome to the world of Java ";                          
        byte b[]=s.getBytes();
        FileOutputStream fi=new FileOutputStream("D:\\Tong.txt");
        for(int i=0;i<b.length;i++)
        {
           fi.write(b[i]);
                       
        }

        fi.close();

        FileOutputStream f=new FileOutputStream("D:\\senthil.java");
        f.write(b);
        f.close();

        FileOutputStream f1=new FileOutputStream("D:\\ramesh.java");
        f1.write(b,0,4);
        f1.close();

        FileInputStream st=new FileInputStream("D:\\ramesh.java");
        int i;
        System.out.println(i=st.available());
        for(i=0;i<3;i++)
        {
            System.out.print((char)st.read());

        }
        System.out.println(" "); 

    }
}
