package com.java;

public class Overload {
	
	public static int  add(int a, int b){
		
		System.out.println(a+b);
		return a+b;
	}
	
	public static int  add(int a, int b, int c){
		System.out.println(a+b*c);
		return a+b+c;
	}
	public static void  add(String a, int b){
		System.out.println(a+b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1=add(12,12);
		int result2=add(11,11,11);
		add("My Age is ",12);
		
		

	}

}
