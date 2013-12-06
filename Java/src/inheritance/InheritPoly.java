package inheritance;

class GrandPa
 {

  void func1()
   {
    System.out.println("\nThis is method 1 in GrandPa");
   }

}

class Father extends GrandPa
 {
  
  void func1()
   {
    System.out.println("\nThis is method 1 in Father");
   }

  void func2()
   {
    System.out.println("\nThis is method 2 in Father");
   }

 }
class Son extends Father
 {
  void func1()
   {
    System.out.println("\nThis is method 1 in Son");
   }

  void func2()
   {
    System.out.println("\nThis is method 2 in Son");
   }

  void func3()
   {
    System.out.println("\nThis is method 3 in Son");
   }

 }

public class InheritPoly
 {

  public void invokeNormal(GrandPa gcl)
  {
    gcl.func1();
  }
//isntanceof keyword is used to check if a reference is instance of a class or not.
  public void invokeFunc(GrandPa gcl)
  {
    if(gcl instanceof GrandPa)
    {
      if(gcl instanceof Father)
      {
       if(gcl instanceof Son)
       {
         Son scl=(Son)gcl;
         scl.func1();
         scl.func2();
         scl.func3();
        }
       else 
       {
         Father fcl=(Father)gcl;
         fcl.func1();
         fcl.func2();
        }
       }
       else
        {
         gcl.func1();
         } 
       }
    } 
        
   public static void main(String[] args)
    {
     InheritPoly inp=new InheritPoly();

     GrandPa   gcl=new GrandPa();
     inp.invokeFunc(gcl);
     inp.invokeNormal(gcl);

     gcl=new Father();
     inp.invokeFunc(gcl);
     inp.invokeNormal(gcl);

     gcl=new Son();
     inp.invokeFunc(gcl);
     inp.invokeNormal(gcl);     
     
     }

}

   
