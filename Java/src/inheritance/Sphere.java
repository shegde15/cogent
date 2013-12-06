package inheritance;
import java.io.*;

  class Sphere{
	protected int r;
	final float pi=3.14f;
	Sphere(){
	r=0;
	}

void get(){
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a number as radius");
	String aut=br.readLine();
	r=Integer.parseInt(aut);
	}catch(IOException e){}
}
float volume(){
float v=(4*pi*r*r*r)/3;
System.out.println("Volume of sphere is"+ v);
return v;
}
}