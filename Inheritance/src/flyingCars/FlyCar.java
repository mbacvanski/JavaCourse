package flyingCars;

public interface FlyCar {
	public default void startEngine () {
		System.out.println("Engine is started on the flying car!!!");
	}
}
