package thread;

class A extends Thread{

	public void run(){
		System.out.println("Thread A started");
		for(int i=0;i<=4;i++){
		System.out.println("\tFrom ThreadA  :  i  ="+i);	
		}
						System.out.println("Exit from A");
		}
}

class B extends Thread{
	public void run(){
		System.out.println("Thread B started");
		for(int j=0;j<=4;j++){
		System.out.println("\tFrom Thread B  :  j  ="+j);	
		}
						System.out.println("Exit from B");
		}
}

class C extends Thread{
	public void run(){
		System.out.println("Thread C started");
		for(int k=0;k<=4;k++){
		System.out.println("\tFrom Thread C  :  k  ="+k);	
		}
						System.out.println("Exit from C");
		}
}

class ThreadPriority{
	public static void main(String args[]){
	A threadA=new A(); 
	B threadB=new B(); 
	C threadC=new C(); 

	threadA.setPriority(Thread.MAX_PRIORITY);
	threadB.setPriority(threadA.getPriority()+1);
	threadC.setPriority(threadB.MIN_PRIORITY);

	System.out.println("Start thread A");
	threadA.start();

	System.out.println("Start thread B");
	threadB.start();
	
	System.out.println("Start thread C");
	threadC.start();
	
	System.out.println("End of main  thread ");
	}
}