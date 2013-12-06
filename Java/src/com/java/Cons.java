    package com.java;

public class Cons {
	
	
	Cons(){
		System.out.println("calling zero arg constructor");
	}

   Cons(int a){
	   System.out.println("Cons.Cons()"+(a*a));
   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Cons();
    //Cons c2=new Cons(12);
	}

}
