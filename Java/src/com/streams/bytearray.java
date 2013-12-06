package com.streams;
import java.io.*;
public class bytearray
{
     public static void main(String arg[])throws IOException
    {
        ByteArrayOutputStream outs=new ByteArrayOutputStream();
        String s="This is Example";
        for(int i=0;i<s.length();++i)
        outs.write(s.charAt(i));
        System.out.println("outStream: "+outs);
        System.out.println("outStream size: "+outs.size());
        byte b[]=outs.toByteArray();
        ByteArrayInputStream ins=new ByteArrayInputStream(b);
        int inb=ins.available();
        System.out.println("instreams  "+inb +"  available");
        byte inbuf[]=new byte[inb];
        int byteread=ins.read(inbuf,0,inb);
        System.out.println("Byte read "+byteread);
        System.out.println("they are :   "+new String(inbuf));

    }

}
