package com.java;

class Animal {
	int health = 100;
}

class Mammal extends Animal { }

class Cat extends Mammal { }

class Dog extends Mammal { }

public class ObjCasting {	 
	 public static void main(String[] args) {
		 Cat c = new Cat();
		 System.out.println(c.health);
		 Dog d = new Dog();
		 System.out.println(d.health);
                  Cat c2 = new Cat();
               System.out.println(c2);
               Mammal m = c2; // upcasting
               System.out.println(m);
               Cat c3 = new Cat();		 
	       Animal a = c3;		 //automatic upcasting to Animal
	       c3 = (Cat) a;          //manual downcasting back to a Cat


	 }  
} 