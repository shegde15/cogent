package inner;
public class Info{

    static String compName="Cogent Infotech Corp";

  public static class Company{

  private double time=16.00;

  private void showinfo(){

 System.out.println("Our Company Name : "+compName);

 System.out.println("The time is : "+time);

 }

 }

 public static void main(String[] args){

  Info.Company object = new Info.Company();

  object.showinfo();

    }

  }