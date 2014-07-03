package moreClasses;

public class MountainBike extends Bicycle { //Is a subclass of Bicycle!!!!!!!!!!
	public int seatHeight; //Member Variable (field)

	public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight) {
		super(startCadence, startGear, startSpeed); //Parameters
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

}