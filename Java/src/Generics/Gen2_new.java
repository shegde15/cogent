package Generics;

/*
References to generic type GenericsType<T> should be parameterized”. 
When we don’t provide type, the type becomes Object and hence it’s 
allowing both String and Integer objects but we should always try 
to avoid this because we will have to use type casting while working 
on raw type that can produce runtime errors.



Generics Type Naming Convention
E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K – Key (Used in Map)
N – Number
T – Type
V – Value (Used in Map)
S,U,V etc. – 2nd, 3rd, 4th types

*/


import java.util.*;

public class Gen2_new<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		Gen2_new<String> type = new Gen2_new<>();
		type.set("Ping"); //valid
		
		Gen2_new type1 = new Gen2_new(); //raw type
		type1.set("Ping"); //valid
		type1.set(10); //valid and autoboxing support
	}
}