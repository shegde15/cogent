package Collections;

import java.util.*;

class Student2 implements Comparable{

   int rollno;
   String name;
   int age;
   Student2(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
   }


	public int compareTo(Object obj){
	Student2 st=(Student2)obj;
	if(age==st.age)
	return 0;
	else if(age>st.age)
	return 1;
	else
	return -1;
	}
}

class Simple8{

	public static void main(String args[]){
	ArrayList al=new ArrayList();
	al.add(new Student2(100,"yao",26));
	al.add(new Student2(106,"ping",22));
	al.add(new Student2(105,"mohammed",24));

//	Collections.sort(al);
//	System.out.println(al.toString());
//	System.out.println(al);
	Iterator itr=al.iterator();
	while(itr.hasNext()){
	Student2 st=(Student2)itr.next();
	System.out.println(st.rollno+" "+st.name+ " " +st.age);
}
}
}

 