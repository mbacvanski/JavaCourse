package moreClasses;

public class MountainBike extends Bicycle{
		public int seatHeight;

	public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight) {
		super(startCadence, startGear, startSpeed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

}