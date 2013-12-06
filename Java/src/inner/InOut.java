package inner;


class Outer2{
	private int x=56;
	void outer(){
		
		Inner in=new Inner();
		System.out.println(in.y);;
		in.display();
	}
	
	 class Inner{
		 private int y=45;
		 void display(){
			 
			 System.out.println(x);
		 }
	 }
	
}

public class InOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Outer2 o1=new Outer2();
		o1.outer();
		// TODO Auto-generated method stub

	}

}
