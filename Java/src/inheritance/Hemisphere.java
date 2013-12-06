package inheritance;
class Hemisphere1 extends Sphere{
	Hemisphere1(){
	super();
	}
	float volume(){
	float h=(2*pi*r*r*r)/3;
	System.out.println("Volume of hemisphere with radius "+r +" is  :"+h);
	return h;
} 

public static void main(String args[]){
	Sphere s=new Sphere();
	Hemisphere1 s1=new Hemisphere1();
	s1.get();
	s1.volume();
	
	//s1.volume();
	}
}