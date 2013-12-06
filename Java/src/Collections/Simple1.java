package Collections;

import java.util.*;

class Student{

   int rollno;
   String name;
   int age;
   Student(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
   }
}



class Simple1{

	public static void main(String args[]){
        Student s1=new Student(101,"Sindhoor",24);
        Student s2=new Student(102,"Tong",23);
	    Student s3=new Student(103,"Jim",25);
	    Student s4=new Student(104,"Li",24);
	    
        
        List al=new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        
        
       
	// By Iterator interface
        	Iterator itr=al.iterator();
        	while(itr.hasNext()){
               Student st=(Student)itr.next();
        	System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}

        


	}
}