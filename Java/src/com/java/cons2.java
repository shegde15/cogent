package com.java;

public class cons2 {
	
	cons2(){System.out.println("calling base");}
		
	cons2(int a){
		
		System.out.println("calling base"+a);
		
	}
	
}
class cons3 extends cons2{
	
	cons3(){
		
		super();
		System.out.println("calling sub");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	new cons2(10);
		new cons3();
		// TODO Auto-generated method stub

	}

}
