package com.io;
import java.io.*;
class file3
{
    public  static void main(String arg[])
    {
        String dir="/";
        File f=new File(dir);

        if(f.isDirectory())
        {
            System.out.println("The Dir name  "+dir);
            String s[]=f.list();

            for(int i=0;i<s.length;i++)
            {
                File f1=new File(dir+"/"+s[i]);
                if(f1.isDirectory())
                {
                    System.out.println(s[i]+" is dir name");
                }
                else
                {
                    System.out.println(s[i]+"is file name ");
                }

             }    

                
        }
        else
            {
                System.out.println(dir+" is not dir");
            }
                        
    }
}
 