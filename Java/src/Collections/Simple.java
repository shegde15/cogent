package Collections;

/*

Uses a dynamic array for storing the elements.
It extends the AbstractList class and implements 
List inteface.
can contain duplicate elements
maintains insertion order
not synchronized
Iterable<--Collection<--AbsractList<--ArrayList


*/

import java.util.*;

class Simple{

	public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("Surya");
        al.add("Li");
        al.add("Jim");
        al.add("Tong");
        al.add("Sindhoor");
       
	// By Iterator interface
        	Iterator itr=al.iterator();
        	while(itr.hasNext()){
        	System.out.println(itr.next());
		}

        // By for-each loop
     
              for(Object obj:al)
              System.out.println(obj);



	}
}