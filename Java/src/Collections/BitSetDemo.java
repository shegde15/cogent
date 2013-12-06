package Collections;
import java.util.*;

class BitSetDemo{
   public static void main(String args[]){
      BitSet b1=new BitSet(10);
      BitSet b2=new BitSet(10);
      for(int i=0;i<10;i++){
         if((i%2)==0)
            b1.set(i);
         if((i%5)==0)
            b2.set(i);
      }
      System.out.println("B1"+b1);
      System.out.println("B2"+b2);
      b2.and(b1);
      System.out.println("B2"+b2);
      b2.or(b1);
      System.out.println("B2"+b2);
      b2.xor(b1);
      System.out.println("B2"+b2);
   }
}
