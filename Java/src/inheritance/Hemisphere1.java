package inheritance;
class Hemisphere2 extends Sphere{
	Hemisphere2(){
	super();
	}
	float volume(){
	float h=(2*pi*r*r*r)/3;
	System.out.println("Volume of hemisphere with radius "+r +" is  :"+h);
	return h;
} 

public static void main(String args[]){
	Sphere s=new Sphere();
	//Hemisphere s1=new Hemisphere();
	s.get();
	s.volume();
	//s1.volume();
	}
}