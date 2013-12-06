package com.exception;

class e1{
	public static void main(String args[]){
	int a=10;
	int b=5;
	int c=5;
	int a1[]=new int[5];
	
	
	try{
	int x=a/(b*c);  //Division by zero
	System.out.println("x  =" +x);
	
	a1[4]=45;
	System.out.println(a1[4]);
	
	
	
	}catch(ArrayIndexOutOfBoundsException e){e.printStackTrace();}
	catch(ArithmeticException e){e.printStackTrace();}
	
	
	
	int y=a/(b+c);
	
	System.out.println("y  =  "+y);
	
	}
}
	