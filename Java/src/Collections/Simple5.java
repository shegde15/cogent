package Collections;

//Set contains unique elements only
// LinkedHashSet maintains insertion order
//TreeSet maintains ascending order

import java.util.*;

class Simple5{

	public static void main(String args[]){
        HashSet al=new HashSet();
        al.add("Ping");
        al.add("Mohammed");
        al.add("Ping");
        al.add("Vivek");

 	LinkedHashSet al2=new LinkedHashSet();
        al2.add("Yao");
        al2.add("Vivek");
        al2.add("Yao");
        al2.add("Vivek");

	TreeSet al3=new TreeSet();
        al3.add("Ping");
        al3.add("Mohammed");
        al3.add("Ping");
        al3.add("Mohammed");

       
	// By Iterator interface
        	Iterator itr=al.iterator();
        	while(itr.hasNext()){
        	System.out.println(itr.next());
		}
		Iterator itr2=al2.iterator();
        	while(itr2.hasNext()){
        	System.out.println(itr2.next());
		}                 
	     	Iterator itr3=al3.iterator();
        	while(itr3.hasNext()){
        	System.out.println(itr3.next());
		}  


	}

}