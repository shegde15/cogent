package inheritance;

class SuperCla
 {
    double a,b;
    SuperCla(double a,double b)
       {
         this.a = a;
         this.b = b;
        }
    void manipulate()
    {
        System.out.println("Data value of a is "+ a +"Data value of b is "+ b);
    }

  }

  class SubCla1 extends SuperCla
  {
     SubCla1(double x,double y)
     {
        super(x,y);
     }

   void manipulate()
      {
        System.out.println("Adding a & b :: The value is "+(super.a+super.b));
      }
  }
 
  class SubCla2 extends SuperCla
  {
      SubCla2(double k,double l)
      {
         super(k,l);
      }
 
      void manipulate()
      {
        System.out.println("Product of a & b :: The value is "+(super.a*super.b));
      }
   }
  
public class OverrideDemo
  {
   
   public static void main(String args[])
   {
     double d1 = Double.parseDouble(args[0]);
     double d2 = Double.parseDouble(args[1]);

     SuperCla spc = new SuperCla(d1,d2);
     spc.manipulate();

     spc = new SubCla1(d1,d2);
     spc.manipulate();

     spc = new SubCla2(d1,d2);
     spc.manipulate();
   }

 }
