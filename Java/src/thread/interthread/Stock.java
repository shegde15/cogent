package thread.interthread;

class Stock{

	int goods=0;
        public synchronized void addStock(int i){
	goods=goods+i;
	System.out.println("Stock added  : "+i);
	System.out.println("Present Stock  : "+goods);
	notify();
	}

        public synchronized int getStock(int j){
	while(true){
	if(goods>=j){
	  goods=goods-j;
        System.out.println("Stock taken away  : "+j);   
	System.out.println("Present stock     : "+goods);	  
	break;
	}
	else{
        System.out.println("Stock not enough . . .");    
	System.out.println("Waiting for stocks to come. . . ");	  
	try{
		wait();
	}catch(InterruptedException e){}
	}
}
return goods;
}
	public static void main(String args[]){
	Stock j=new Stock();
	Producer p=new Producer(j);
        	Consumer c=new Consumer(j);
	try{
	  Thread.sleep(10000);
	  p.stop();
	  c.stop();
	p.t.join();
	c.t.join();
	System.out.println("Thread stopped");
	}catch(InterruptedException e){}
      
	}
}


	
