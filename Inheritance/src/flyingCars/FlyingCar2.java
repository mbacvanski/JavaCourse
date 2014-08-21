package flyingCars;

public class FlyingCar2 implements FlyCar, OperateCar {
	public void startEngine() {
		//Keyword super
		FlyCar.super.startEngine();
		OperateCar.super.startEngine();
	}
}
