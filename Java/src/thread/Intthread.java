package thread;
class Intthread33 extends Thread{

Thread t;

Intthread33(){
	t=new Thread(this,"TestThread");
        System.out.println("Child thread: " +t);
        t.start();
}

	public void run(){
	try{
		for(int i=5;i>0;i--){
	System.out.println("Child thread: "+i);
	Thread.sleep(1000);
	}
	}catch(InterruptedException e){}
System.out.println("Exiting child thread...");
}


public static void main(String args[]){
	Intthread33 i=new Intthread33();
try{
	for(int j=5;j>0;j--){
	System.out.println("Main thread: "+j);
 	Thread.sleep(1000);
 	}
}catch(InterruptedException e){}
System.out.println("Main thread exiting....");
}
}
