package annotation;

public class DepTest2 {
	  public static void main(String[] args) {
	    DepTest1 test = new DepTest1();
	    test.serve();
	  }
	}

	class DepTest1 {
	 @Deprecated
	  public void serve() {

	  }

	}
