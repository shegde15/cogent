package inheritance;

class W{
	int i;	
	
	W(){
		
	}
	W(int i){
	this.i=i;	
		
	}
	
  

}

class Y extends W{
	
int i=2;	
}


class X extends Y{
	int i;

                X(int a,int b){
	super.i=a;//i in W base class
                   i=b;//i in sub class
	
	}

	void display(){
	System.out.println("The value of superclass value is    "+super.i);
	System.out.println("The value of sub class  is    "+i);
	 
	}
}


class superY{
	public static void main(String args[]){
	X x1=new X(4,5);
	x1.display();
	}
}
	