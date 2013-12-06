package inner;
import java.lang.*;

public class Outer{

  private int x = 100;

  class Inner{

  private int x = 200;

  public void check(){

   System.out.println("Value of x is: "+ Outer.this.x );
   System.out.println("The innser class is "+x);;

  }

  }

  public void check(){

  new Inner().check();

  }

  public static void main(String args[]){

  new Outer().check();

  }

}