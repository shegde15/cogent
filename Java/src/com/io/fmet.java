package com.io;
import java.io.*;

class fmet{

public static void main(String st[]) throws IOException
{
File f=new File("d:\\desktop\\Wemployee1.java");

System.out.println("file name="+f.getName());
System.out.println("path="+f.getPath());
System.out.println("Absolute path="+f.getAbsolutePath());
System.out.println(f.exists() ? "file exists":"file dosen't exist");
System.out.println(f.isDirectory() ? "directory":"is not a directory");
System.out.println(f.isFile() ? "file ":"it is not a file");
System.out.println(f.canRead() ? "file can read ":"cant read");
System.out.println(f.canWrite() ? "file can be wirte":"cant write");
System.out.println(f.isAbsolute() ? "file is absolute":"it is not an absolute");

}

}

