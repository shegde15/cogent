package com.streams;
import java.io.*;

public class chararray{


    public static void main(String args[]) throws Exception 
    {
        CharArrayWriter outstream = new CharArrayWriter();
        String s = "This is a Test Program";
        for (int i=0;i<s.length();++i)
        outstream.write(s.charAt(i));
        System.out.println("outstream" +outstream);
        System.out.println("size" +outstream.size());
        CharArrayReader instream=new CharArrayReader(outstream.toCharArray());
        //CharArrayReader(outstream.toStringBuffer(" ");
        int ch=0;
        StringBuffer sb= new StringBuffer(" ");
        while((ch=instream.read())!=-1)
        sb.append((char)ch);
        String es=sb.toString();
        System.out.println(es.length()+"character were read");
        System.out.println("They are: " +es);
    }
}

