package Collections;

import java.util.*;

class Simple2{

	public static void main(String args[]){
        ArrayList a1=new ArrayList();
        a1.add("Ping");
        a1.add("Mohammed");
        a1.add("Yao");
        a1.add("Vivek");

	ArrayList a2=new ArrayList();
        a2.add("Saran");
        a2.add("Chris");
        a2.add("Yao");
        
        //a1.addAll(a2);
      //  a1.retainAll(a2);
       a1.removeAll(a2);
        
        Collections.sort(a1);
       
        System.out.println("collections.sort1" +a1);
        a1.add("Aram");
        Collections.sort(a1);
        System.out.println("collections.sort2" +a1);
	// By Iterator interface
        	Iterator itr=a1.iterator();
        	while(itr.hasNext()){
        	System.out.println(itr.next());
		}

        // By for-each loop
     
              for(Object obj:a1)
              System.out.println(obj);



	}
}