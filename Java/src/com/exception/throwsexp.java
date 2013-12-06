package com.exception;
class X{

	 void cal() throws Exception{
		 int i1=0;
			int f1=56;
			int d1=f1/i1;
	System.out.println("caling cal methd");	 
}
	void display(){
	System.out.println("caling dis methd");
	}
}

class  Y extends X{
	void cal() throws NullPointerException{
//try{
	int i=0;
	int f=56;
	int d=f/i;
//}catch(Exception ee){System.out.println(ee);}
	}


public static void main(String s[]){
	Y t1=new Y();
	try{
	t1.cal();
	}catch(Exception e){e.printStackTrace();}
	t1.display();
	 }

}
