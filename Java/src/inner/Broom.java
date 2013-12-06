package inner;

//static inner class
class Cover
{
         static class InnerCover
             {
              void go()
                  {
                       System.out.println("I am the Cover Static Inner Class");
                  }
            }
 }

class Broom
{
           class InnerBroom
        {
                  void go1()
                   {
                         System.out.println("I am Broom Static Inner Class");
                    }
         }

         public static void main(String[] args) {
         // You have to use the names of both the classes 
        /* Cover.InnerCover demo = new Cover.InnerCover(); 
         demo.go();*/
        // Here we are accessing the enclosed class 
         Broom b1=new Broom();
        /*InnerBroom innerBroom = new InnerBroom ();
        innerBroom .go1();*/
         /*b1.InnerBroom test=n*/
         Broom.InnerBroom tt=b1.new InnerBroom();
         tt.go1();
         
         
         
         
 }
}