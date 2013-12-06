package thread.interthread;
class Consumer implements Runnable{

	Stock c;
	Thread t;
	Consumer(Stock c){
	this.c=c;
	t=new Thread(this,"consumer thread");
	t.start();
	}

	public void run(){
	while(true){
		try{
		t.sleep(750);
		}catch(InterruptedException e){}
	c.getStock((int)(Math.random()*100));
	}
	}
	
		void stop(){
		t.stop();
		}

}






















