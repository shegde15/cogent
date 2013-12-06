package com.java;

public class Method {
	int a;
	int b;
	void calculate(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("calculate method is called"+(a+b));
	}
	
	void calculate(int a,int b,int c){
		this.a=a;
		this.b=b;
		System.out.println("calculate method is called"+(a+b+c));
	}
	
	void calculate(String s,int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("calculate method is called"+(s+a+b));
	}
	
	public static void main(String args[] ){
		
		Method m1=new Method();
		m1.calculate(10,10);
		m1.calculate("Mycalucation value is  ", 23,27 );
		m1.calculate(34,23,45);
		
		
	}

}
