package thread;

class CreateThread3 implements Runnable{

String tname;
Thread t;

CreateThread3(String s){
        tname=s;
	t=new Thread(this,s);
        System.out.println("New thread: " +t);
        t.start();
       // t.setName("oneupdate");
}

	public void run(){
	try{
		for(int i=5;i>0;i--){
	System.out.println(tname + ":" +i);
	Thread.sleep(1500);
	}
	}catch(InterruptedException e){}
System.out.println(tname+ "  Exiting...");
}

}
class  ThreadMethod23{

	public static void main(String args[]){
	System.out.println("Main Thread Starting");
	CreateThread3 m1=new CreateThread3("one");
	m1.t.setPriority(Thread.MAX_PRIORITY);
	CreateThread3 m2=new CreateThread3("two");
	m2.t.setPriority(Thread.NORM_PRIORITY);
	m1.t.setName("1");
	m2.t.setName("2");
	m1.t.setPriority(1);
	System.out.println(m1.t.getName());
	 System.out.println(m2.t.getName());
	 

System.out.println("Thread m1 is alive: " + m1.t.isAlive());
System.out.println("Thread m2 is alive: " + m2.t.isAlive());
try{
m1.t.join();
m2.t.join();
}catch(InterruptedException e){e.printStackTrace();}

System.out.println("Main Thread Exiting");



 


 
}
}
