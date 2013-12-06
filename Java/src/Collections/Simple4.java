package Collections;

import java.util.*;

/*
ListInterface extends Collection.
It contains methods to insert and delete elements in index basis.
*/

class Simple4{

	public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("Ping");
        al.add("Mohammed");
        al.add("Yao");
        al.add("Vivek");
        al.add(2,"Sam");
        System.out.println("Element at 4th position "+al.get(3));

       ListIterator itr=al.listIterator();
       System.out.println(itr.next());
       System.out.println(itr.hasPrevious());
  System.out.println("Traversing elements in forward direction  ");
       while(itr.hasPrevious()){
    	   
		System.out.println(itr.previous());
		
	}

}
}









	 
 


	