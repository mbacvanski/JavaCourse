package flyingCars;

public interface OperateCar {
	default public void startEngine() {
		System.out.println("Engine is started for the normal car!!!");
	}
}
