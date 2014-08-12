package flyingCars;

public class FlyingCar implements FlyCar, OperateCar {
	public void startEngine() { //Must be overridden, as both interfaces have default implementations.
		System.out.println("Both the flying car and normal car engines have been started!!!");
	}
}
