package moreClasses;

public class Bicycle {
	
	//Fields!
	public int cadence;
	public int gear;
	public int speed;
	
	//Constructor!
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
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

	public void SetGear(int gear) {
		this.gear = gear;
	}

	public int getCadence() {
		return cadence;
	}
	
}
