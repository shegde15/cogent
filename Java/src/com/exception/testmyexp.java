package com.exception;
class myexp extends Exception{
myexp(String s){
super(s);
}
} 

class testmyexp{
	public static void main(String s[]){
	int x=1, y=10000;


	try{
	//float z=(float)x/(float)y;
		float z=x/y;
	if(z<0.00000001){
	throw new myexp("Numer is too small");
 }
}catch(Exception e){
System.out.println("caught my exception"+e);
e.printStackTrace();
}
finally{
System.out.println("I am always here");
}
}
}
