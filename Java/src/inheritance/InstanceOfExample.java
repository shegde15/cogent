package inheritance;

class Vehicle {

	String name;
	Vehicle() {
		name = "Vehicle";
	}
}

class HeavyVehicle1 extends Vehicle {

	HeavyVehicle1() {
		name = "HeavyVehicle";
	}
}

class Truck extends HeavyVehicle1 {

	Truck() {
		name = "Truck";
	}
}

class LightVehicle extends Vehicle {

	LightVehicle() {
		name = "LightVehicle";
	}
}

public class InstanceOfExample {

	static boolean result;
	static HeavyVehicle1 hV = new HeavyVehicle1();
	static Truck T = new Truck();
	static HeavyVehicle1 hv2 ;
	public static void main(String[] args) {
		result = hV instanceof HeavyVehicle1;
		System.out.print("hV is an HeavyVehicle: " + result + "\n");
		result = T instanceof HeavyVehicle1;
		System.out.print("T is an HeavyVehicle: " + result + "\n");
		result = hV instanceof Truck;
		 
		System.out.print("hV is a Truck: " + result + "\n");
		result = hv2 instanceof HeavyVehicle1;
		System.out.print("hv2 is an HeavyVehicle: " + result + "\n");
		hV = T; //Sucessful Cast form child to parent
		T = (Truck) hV; //Sucessful Explicit Cast form parent to child
	}
}