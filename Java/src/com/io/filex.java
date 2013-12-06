package com.io;
import java.io.*;
class filex
{
      static void p(String s)
      {
            System.out.println(s);
      }
      public static void main(String  arg[])
      {
             File f=new File("\\");
             p("file name "+f.getName());
             p("file path "+f.getPath());
             p("abs file name "+f.getAbsolutePath());
             p("file name "+f.getParent());
             p(f.exists()? "exists":" not exists");
             p(f.canWrite()?"is write":"does not write");
             p(f.canRead()?"read":"not read");
             p(f.isDirectory()?"dir":"not dir");
             p(f.isFile()?"file":"not file");
              p(f.isAbsolute()?"is abs":"not abs");

             p("last modi "+f.lastModified());
             p("length "+f.length());

              
      }
}
