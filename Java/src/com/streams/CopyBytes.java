package com.streams;
import java.io.*;
	
	class CopyBytes{
	
		public static void main(String args[]){
 
	           FileInputStream infile=null;
	           FileOutputStream outfile=null;
		byte byteRead;
		int b;
		try{
		   infile=new FileInputStream(args[0]);
		   outfile=new FileOutputStream(args[1]);
		 do{
		  byteRead=(byte)infile.read();
		  outfile.write(byteRead);
		} 
		while(byteRead != -1);
		}catch(FileNotFoundException e){
		   System.out.println("file not found");
		  }catch(IOException e)
		{
		 System.out.println(e.getMessage());
		    
		}
 		finally{
		try{
			infile.close();
			outfile.close();
		}catch(IOException e){}
	
	}
}
}		     



		
	