package bicycles;

public class ATVBicycleDemo {

	public static void main(String[] args) {
		ATVBicycle chukarsBike = new ATVBicycle();
		chukarsBike.printStatus();
		chukarsBike.brakes(false);
		chukarsBike.setGear(42);
		chukarsBike.setSeats(2);
		chukarsBike.setWheels(3);
		chukarsBike.printStatus();
		chukarsBike.brakes(true);
		chukarsBike.printStatus();
	}

}
