
package com.streams;
//Copy characters from one file to another

import java.io.*;

class CopyCharacters{
	public static void main(String args[]){
	  File inFile=new File("buf.java");
	  File outFile=new File("abc");
	 FileReader ins=null;
	 FileWriter outs=null;
	 try{
	        ins=new FileReader(inFile);
	        outs=new FileWriter(outFile);
	int ch;
	while((ch = ins.read()) != -1)
	{
	   outs.write(ch);
	}
	}catch(IOException e){System.out.println(e);}
	finally{
	try{
	ins.close();
	outs.close();
	}catch(IOException  e){}
	}
}     }

	
	 
	  

                 