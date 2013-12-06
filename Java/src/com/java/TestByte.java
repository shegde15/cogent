package com.java;

public class TestByte
{    
	public static void main(String[] argv) {
		
		//Convert bytearray to String
 
		    String example = "This is a Test";
		    byte[] bytes = example.getBytes();
 
		    System.out.println("Text : " + example);
		    System.out.println("Text [Byte Format] : " + bytes);
		    System.out.println("Text [Byte Format] : " + bytes.toString());
 
		    String s = new String(bytes);
		    System.out.println("Text Decryted : " + s);
 
 
	}
}
