package Generics;


public class Gen2 {

	public static void main(String[] args) {
		System.out.println(max(23,45,1));
		
		System.out.println(max("apples","orange","first"));

	}
	
	
	//how to return generic data  cant compare <> for string and numbers
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		T max=a;
		
		//< return negative -1  == 0 > 1
		
		if(b.compareTo(a)>0)
			
			max=b;
		
		if(c.compareTo(max) > 0)
			max=c;
		
		return max;
			
		
		
		
		
	}

}
