package com.streams;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class Serializer {
 
   public static void main (String args[]) {
 
	   Serializer serializer = new Serializer();
	   serializer.serializeAddress("wall street", "united states");
   }
 
   public void serializeAddress(String street, String country){
 
	   Address address = new Address();
	   address.setStreet(street);
	   address.setCountry(country);
 
	   try{
 
		FileOutputStream fout = new FileOutputStream("D:\\address4.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);   
		oos.writeObject(address);
		oos.close();
		System.out.println("Done");
 
	   }catch(Exception ex){
		   ex.printStackTrace();
	   }
   }
}