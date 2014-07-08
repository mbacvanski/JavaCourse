package moreClasses;

public class Bicycle {
	
	//Fields!
	public int cadence;
	public int gear;
	public int speed;
	
	//Constructor!
	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	}
	
	public Bicycle() {
		cadence = 0;
		gear = 0;
		speed = 0;
	}
	
	//Getters and Setter methods!
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getCadence() {
		return cadence;
	}
	
}
