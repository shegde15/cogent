package Generics;

import java.util.*;

public class Gen_Old2 {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
        	Gen_Old2 type = new Gen_Old2();
		type.set("Pankaj"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
	}
}