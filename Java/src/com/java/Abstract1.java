package com.java;

public abstract class Abstract1 {
	
	public abstract void add(int a, int b);
	public void display(){System.out.println("calling display method");}
	
	

}

class Implemen extends Abstract1{
	
	public void add(int a, int b){
System.out.println(a+b);
	
}
	
	public static void main(String args[]){
		Implemen imp=new Implemen();
		imp.add(11, 11);
	}
	
}
