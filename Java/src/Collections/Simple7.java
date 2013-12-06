package Collections;

/*
Map contains values based on key(key-value pair) 
Each pair is know as the entry
Map contains only unique elements
HashMap may have one null key and mutiple null values
It maintains no order
LinkedHashMap is same as HashMap except maintain insertion order
TreeMap contains unique elements
TreeMap cannot have null key but can have multiple null values
TreeMap maintains ascending order

Difference between HashMap and TreeMap

1. HashMap can contain one null value key but TreeMap cannot contain any null key
2. HashMap maintains no order but TreeMap maintains ascending order


Difference  between HashMap and HashTable

1. HashMap is not synchronized but HashTable is synchronized
2. HashMap can contain only null key and multiple null values but HashTable cannot contain any null key nor value

*/


import java.util.*;

class Simple7{

	public static void main(String args[]){
        Map al=new HashMap();
        al.put(100,"Ping");
        al.put(null,"Mohammed");
        al.put(102,"Anette");
        al.put(103,"Vivek");
	al.put(104,"Saran");
        al.put(105,"Chris");
        al.put(106,"Ping");

 	Set set=al.entrySet();
        Iterator itr=set.iterator();

        while(itr.hasNext()){
	Map.Entry m=(Map.Entry)itr.next();
	System.out.println(m.getKey()+  "    " + m.getValue());
	}
        System.out.println("***********");
 	LinkedHashMap al2=new LinkedHashMap();
        al2.put(100,"Ping");
        al2.put(101,"Mohammed");
        al2.put(102,"Anette");
        al2.put(103,"Vivek");
	al2.put(104,"Saran");
        al2.put(105,"Chris");

 	Set set1=al2.entrySet();
        Iterator itr2=set1.iterator();

        while(itr2.hasNext()){
	Map.Entry m2=(Map.Entry)itr2.next();
	System.out.println(m2.getKey()+  "    " + m2.getValue());
	}
System.out.println("***********");
	TreeMap al3=new TreeMap();
        al3.put(106,"Ping");
        al3.put(101,"Mohammed");
        al3.put(102,"Anette");
        al3.put(103,"Vivek");
	al3.put(104,"Saran");
        al3.put(105,"Chris");

 	Set set2=al3.entrySet();
        Iterator itr3=set2.iterator();

        while(itr3.hasNext()){
	Map.Entry m3=(Map.Entry)itr3.next();
	System.out.println(m3.getKey()+  "    " + m3.getValue());
	
	}

       
	
	}
}
