package com.io;
import java.io.*;
class cnf{

	public static void main(String args[]) {//throws IOException{
		
    try{
	File f=new File("d:\\test\\test2\\test3\\test4\\test5");
	
	 f.mkdirs();
	 System.out.println("File created");
     
	
	
    }catch(Exception e){e.printStackTrace();}
	}
}