package Collections;

import java.util.*;

class Simple3{

	public static void main(String args[]){
        ArrayList a1=new ArrayList();
        a1.add("Ping");
        a1.add("Mohammed");
        a1.add("Yao");
        a1.add("Vivek");

	ArrayList a2=new ArrayList();
        a2.add("Saran");
        a2.add("Chris");
        
        a1.removeAll(a2);
       //a1.retainAll(a2);
        
	// By Iterator interface
        	Iterator itr=a1.iterator();
        	while(itr.hasNext()){
        	System.out.println(itr.next());
		}

       



	}
}