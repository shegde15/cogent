package com.io;
import java.io.*;
class ex implements FilenameFilter
	{
    String ext;
    ex(String ext)
    {
        this.ext=ext;
    }
    public boolean accept(File dir,String name)
    {
        return name.startsWith(ext);
    }

}
class filefit 
{
    public static void main(String arg[])
    {
        String dir="d:\\desktop";
        File f=new File(dir);
        ex on=new ex("c");
        String s[]=f.list(on);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }

    }
} 

                           
