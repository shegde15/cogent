package thread;

class ThreadMethod1{
	public static void main(String args[]){
	Thread t=Thread.currentThread();
	System.out.println("current thread:  "+t);
	System.out.println("Name of the current thread:  "+t.getName());
	System.out.println("Priority:  "+t.getPriority());
	t.setName("mythread");
	
	t.setPriority(2);
                   System.out.println("after priority change : "+t);	
	System.out.println("number of active threads : "+t.activeCount());
}
}
	