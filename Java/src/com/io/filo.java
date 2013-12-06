
package com.io;
import java.io.*;

public class filo {
public static void main(String st[])throws IOException{

byte b[]=new byte[50];
System.out.println("enter ur text about 50 lines ie about 2 lines");
for(int i=0; i<50; i++)
b[i]=(byte)System.in.read();

OutputStream o=new FileOutputStream("c://CoreJava//swing.txt");
for(int i=0; i<50; i++)
o.write(b[i]);
o.close();

InputStream is=new FileInputStream("c://CoreJava/swing.txt");
int sz=is.available();
System.out.println("output from the file txt"+sz);
for(int i=0; i<50; i++)
System.out.print((char)is.read());
is.close();
}
}




