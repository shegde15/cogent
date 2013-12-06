package com.java;

public class Override {
	
	final int x=33;
	
	
	public void display(){
		
		System.out.println("calling base class");
	}

	/**
	 * @param args
	 */
	
}

class Sub extends Override{
	
public void display(){
		
		System.out.println("calling sub class");
	}
	
	public static void main(String args[]){
		Sub s1 =new Sub();
		s1.display();
		Override ox=new Override();
		ox.display();
		Override ox1=new Sub();
		ox1.display();
		
	}
	
}
