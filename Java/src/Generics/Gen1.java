package Generics;
import java.util.*;
public class Gen1 {

	
	public static void main(String[] args) {
		Integer[] iray={1,2,3,4};
		Character[] cray={'b','u','d','y'};
	   printMe(iray);
	   printMe(cray);
		
		
	}

	private static void printMe(Integer[] i){
		for(Integer x:i)
			System.out.printf("%s",x);
		
		System.out.println();
		
		
	}
	
	private static void printMe(Character[] i){
		for(Character x:i)
		System.out.printf("%s",x);
		
		System.out.println();
		
		
	}
	
	//generic method
	public static <T> void printMe(T[] x){
		for(T b:x)
		System.out.printf("%s ",b);
		
	}
	
	
	
}
