package inheritance;

class Car extends Object {

	void carMethod() {
	}
}

class HeavyVehicle extends Object {
}

class Ford extends Car {

	void fordMethod() {
		System.out.println("I am fordMethod defined in Class Ford");
	}
}

class Honda extends Car {

	void fordMethod() {
		System.out.println("I am fordMethod defined in Class Honda");
	}
}

public class ObjectCastingEx {

	public static void main(String[] args) {
		Car obj = new Ford();
		//    Following will result in compilation error
		//    obj.fordMethod();	//As the method fordMethod is undefined for the Car Type
		//  Following will result in compilation error
		// ((HeavyVehicle)obj).fordMethod();
					//fordMethod is undefined in the HeavyVehicle Type
		//  Following will result in compilation error
		((Ford) obj).fordMethod();
		//Following will compile and run
		//	Honda hondaObj = (Ford)obj;	Cannot convert as they are sibblings
	}
}