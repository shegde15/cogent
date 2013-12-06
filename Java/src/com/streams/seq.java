package com.streams;
import java.io.*;
public class seq
{
    public static void main(String arg[])throws IOException
    {
        SequenceInputStream sq;
        FileInputStream f=new FileInputStream("D:/senthil.java");
        FileInputStream f1=new FileInputStream("D:/ramesh.java");
        sq=new SequenceInputStream(f,f1);
        BufferedInputStream  in=new BufferedInputStream(sq);
        BufferedOutputStream out=new BufferedOutputStream(System.out);
         
        boolean eof=false;
        int bytecount=0;
        while(!eof)
        {
            int c=in.read();
            if(c==-1)
            eof=true;
            else{
                out.write((char)c);
                ++bytecount;
            }
            
        }
        String byteread=String.valueOf(bytecount);
        byteread+="byte were read\n";
        out.write(byteread.getBytes(),0,byteread.length());
        in.close();
        out.close();
        f.close();
        f1.close();


    }
}
