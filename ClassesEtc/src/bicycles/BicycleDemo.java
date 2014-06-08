package bicycles;

public class BicycleDemo {
	
	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.printStates();
		bike1.changeCadence(42);
		bike1.increaseGear(2);
		bike1.decreaseGear(1);
		bike1.speedUp(5);
		bike1.slowDown(3);
		bike1.printStates();
		
		bike2.printStates();
		bike2.changeCadence(42);
		bike2.increaseGear(2);
		bike2.decreaseGear(1);
		bike2.speedUp(5);
		bike2.slowDown(3);
		bike2.printStates();
	}

}
