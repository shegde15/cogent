package Collections;

/*
Queue Interface orders the element in FIFO.
PriorityQueue class does not orders the elements in FIFO manner.

*/


import java.util.*;

class Simple6{

	public static void main(String args[]){
        PriorityQueue queue=new PriorityQueue();
        queue.add("Ping");
        queue.add("Mohammed");
        queue.add("Ping");
        queue.add("Vivek");
        queue.add("Saran");
        queue.add("Chris");

 	System.out.println("head: "+queue.element());
 	System.out.println("head: "+queue.peek());

       
	// By Iterator interface
        	Iterator itr=queue.iterator();
        	while(itr.hasNext()){
        	System.out.println(itr.next());
		}

	queue.remove();
	queue.poll();

	System.out.println("after removing two elements");

	Iterator itr2=queue.iterator();
        	while(itr2.hasNext()){
        	System.out.println(itr2.next());
		}
	}
}
