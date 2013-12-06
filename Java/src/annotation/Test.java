

package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)

@interface Yao {
	int x=10;
	  public String stringValue();
	  public int intValue();
	}



public class  Test {
	  // Annotate a method.
	  @Yao(stringValue = "My age is ", intValue = 24)
	  public static void myMethod() {
		  		  
		  Test t1=new Test();
		 
		  try{
			 
			  Class c=t1.getClass();
			  @SuppressWarnings(value="myMethod")
			  Method m=c.getMethod("myMethod");
			  
			  
			  Yao hh=m.getAnnotation(Yao.class);
			  System.out.println(hh.stringValue()+ hh.intValue()+hh.x);
			  
		  }catch(NoSuchMethodException exc){}
		  
		  
	  }

	  
	  public static void main(String args[]){
		  myMethod();
	  }
	  
	}