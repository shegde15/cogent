package com.io;
import java.io.*;

public class List
{
public static void main(String st[])throws Exception
{
File f=new File("c:/");
File ff[]=f.listRoots();
for(int i=1;i<ff.length;i++)
{
String s[]=ff[i].list();
    for(int j=0;j<s.length;j++)
     System.out.println(s[j]);
System.out.println(ff[i]);
}
}
}
