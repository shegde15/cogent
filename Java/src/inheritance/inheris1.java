package inheritance; 
class inherm1{
int j=4;
void square(int w){
System.out.println("the square of j="+((j*j)+w));
}
}

class inhers1 extends inherm1{
int d=4;
void add(int w){
System.out.println("The addition="+(d+j));
}
public static void main(String s[]){
inhers1 in=new inhers1();
in.square(5);
in.add(5);
}
}

