package flyingCars;

public class FlyingCar2 implements FlyCar, OperateCar {
	public void startEngine() {
		FlyCar.super.startEngine();
		OperateCar.super.startEngine();
	}
}
