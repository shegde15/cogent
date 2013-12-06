package Collections;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		Stack<String> ss=new Stack<String>();
		ss.push("bottom");
		printStack(ss);
		ss.push("second");
		printStack(ss);
		ss.push("third");
		printStack(ss);		
		
		ss.pop();
		printStack(ss);	
		ss.pop();
		printStack(ss);	
		ss.pop();
		printStack(ss);	
		

	}
	
	private static void printStack(Stack<String> s){
		if(s.isEmpty())
		System.out.println("you have nothing in your stack");
		
		else{
			
			System.out.printf("%s TOP\n",s);
		}
	}

}
