package com.java;

public class Employee {

	/**
	 * @param args
	 */
	String empName="Mohammed";
	int    empId= 100;
	double empSalary= 100000;
	
	static int area(int a){
	return a*a;	
			
	}
	
	void display(){
		System.out.println("The empId is   "+empId);
		System.out.println("The employee Name is  "+empName);
		System.out.println("The employee Salary  "+empSalary);
	
	}
	static{
		
		System.out.println("calling static block");
	}
	public static void main(String[] args) { 
		
		/*Overload oo=new Overload();
		oo.add(10, 10);
		oo.add(11,11,21);
		oo.add("Test",22);*/
		
		int result=area(5);
		System.out.println("The result is    "+result);
		
		int counter=1; int count=4;
		
		System.out.println(counter+count+"The sum of counter is");
		for(int i=0;i<10;i++){
			System.out.println("The value of is is "+ i);
		}
		
		while(counter<10){
			
			counter= counter+1;
			System.out.println(counter);
			
		}
		
		Employee e1=new Employee();
		e1.display();
		
		// TODO Auto-generated method stub
		

	}

}
