package thread.interthread;

class Producer implements Runnable{

        Stock s;
	Thread t;
        Producer(Stock s){
	this.s=s;
	t=new Thread(this,"producer thread");
	t.start();
	}

	public void run(){
	while(true){
		try{
		t.sleep(750);
		}catch(InterruptedException e){}
        s.addStock((int)(Math.random()*100));
	}
	}
	
		void stop(){
		t.stop();
		}

}






















