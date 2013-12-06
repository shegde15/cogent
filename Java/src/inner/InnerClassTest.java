package inner;

class OuterClassTest {
	public void foo() {
		ReallyInner rin=new ReallyInner();
        System.out.println("Outer class");
	}
	
	  class ReallyInner {
	    public void foo() {
	        System.out.println("Inner class");
	    }
	
	    public void test() {
	        this.foo();
	        OuterClassTest out=new OuterClassTest();
	        out.foo();
	    }
	}
	
	public static void main(String[] args) {
      OuterClassTest o = new OuterClassTest();
        OuterClassTest.ReallyInner i =o.new ReallyInner();
       OuterClassTest oo=new OuterClassTest();
        
        i.test();
	}
}
