package thread;

class NewThread extends Thread{
	String name;
	Thread t;

	NewThread(String threadname){
	name=threadname;
	t=new Thread(this, name);
	System.out.println("New thread: " +t);
        t.start();
}

	public void run(){
	try{
		for(int i=15;i>0;i--){
	System.out.println(name+ ":"  +i);
        Thread.sleep(1500);
	}
	}catch(InterruptedException e){
	System.out.println(name+ " interrupted.");
	}
  	System.out.println(name+ " exiting.");
}
}


class SuspendResume{
	public static void main(String args[]){
	NewThread ob1=new NewThread("One");
	NewThread ob2=new NewThread("Two");

	try{
	  Thread.sleep(1500);
	  ob1.t.suspend();
	  System.out.println("Suspending thread One");
	  Thread.sleep(2500);
	  ob1.t.resume();
          System.out.println("Resuming thread One");			


	  ob2.t.suspend();
	  System.out.println("Suspending thread Two");
	  Thread.sleep(2500);
	  ob2.t.resume();
          System.out.println("Resuming thread Two");			


	}catch(Exception e){
	System.out.println("Main thread Interrupted");
	}


try{
	System.out.println("Waiting for thread to finish");
	ob1.t.join();
	ob2.t.join();
	}catch(Exception e){
	System.out.println("Main thread Interrupted");
	}
	System.out.println("Main thread exiting");
}
}	