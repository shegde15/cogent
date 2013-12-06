package com.io;
import java.io.*;

class mdir {
	public static void main(String args[]) throws IOException{
	File f=new File("c:\\BATCH1\\io\\xx\\yy\\zz\\aa" );
	//f.createNewFile();
                  f.mkdirs();
 
	}
}