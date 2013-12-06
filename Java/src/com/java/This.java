package com.java;


public class This {
	
	int a=23;
	int b=56;
	int c=45;
	
	void add( int a, int b, int d){
		this.c=d;
		this.a=a;
		this.b=b;
			}
	
	void display(){
		System.out.println("the value of a  is "+ a);
		System.out.println("the value of b  is "+ b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This ex=new This();
		ex.display();
		

	}

}
