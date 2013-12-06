package Collections;

/*
Comparator interface is used to order the objects 
of user-defined class. It provdes multiple soring sequence. 
Here we are going to sort by name and age of a user-defined class

*/

import java.util.*;

class Student3 {

   int rollno;
   String name;
   int age;
   Student3(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
   }
} 


	class AgeComparator implements Comparator{


		public int compare(Object ob11,Object ob22){
		Student3 s1=(Student3)ob11;
		Student3 s2=(Student3)ob22;
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
		return 1;
		else
		return -1;
		}

	
	}


	class NameComparator implements Comparator{


		public int compare(Object ob1,Object ob2){
		Student3 s1=(Student3)ob1;
		Student3 s2=(Student3)ob2;
		return s1.name.compareTo(s2.name);
		}

		 
		
	}

class Simple9{

	public static void main(String args[]){
	ArrayList al=new ArrayList();
	al.add(new Student3(100,"yao",23));
	al.add(new Student3(101,"ping",24));
	al.add(new Student3(102,"mohammed",25));

	
	System.out.println("Sorting by name");

	Collections.sort(al,new NameComparator());
	Iterator itr=al.iterator();
	while(itr.hasNext()){
	Student3 st=(Student3)itr.next();
	System.out.println(st.rollno+" "+st.name+ " " +st.age);
	}

	System.out.println("Sorting by age");


	Collections.sort(al,new AgeComparator());
	Iterator itr3=al.iterator();
	while(itr3.hasNext()){
	Student3 st=(Student3)itr3.next();
	System.out.println(st.rollno+" "+st.name+ " " +st.age);
	}



	}
}

 