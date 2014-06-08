
package bicycles;

public class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	public void slowDown(int decrement) {
		speed = speed - decrement;
	}
	
	public void increaseGear(int increment) {
		gear = gear + increment;
	}
	
	public void decreaseGear(int decrement) {
		gear = gear - decrement;
	}
	
	public void printStates() {
		System.out.println("Cadence: " + cadence);
		System.out.println("Speed: " + speed);
		System.out.println("Gear: "+ gear);
	}
}
