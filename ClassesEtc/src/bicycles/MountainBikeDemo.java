package bicycles;

public class MountainBikeDemo {

	public static void main(String[] args) {
		MountainBike bike = new MountainBike();
		bike.printStates();
		bike.changeCadence(42);
		bike.increaseGear(5);
		bike.decreaseGear(3);
		bike.speedUp(42);
		bike.slowDown(20);
		bike.raiseSeat(5);
		bike.lowerSeat(2);
		bike.setTrailer(false);
		bike.printStates();
		bike.setTrailer(true);
		bike.printStates();
	}

}
