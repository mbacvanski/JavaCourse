package moreClasses;

public class BicycleTester {

	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle();
		
		System.out.println("The current cadence bicycle1 is in is " + bicycle1.getCadence());
		System.out.println("The current gear bicycle1 is in is " + bicycle1.getGear());
		System.out.println("The current speed bicycle1 is in is " + bicycle1.getSpeed());
		
		bicycle1.setCadence(42);
		bicycle1.setGear(42);
		bicycle1.setSpeed(42);
		
		System.out.println("The current cadence bicycle1 is in is " + bicycle1.getCadence());
		System.out.println("The current gear bicycle1 is in is " + bicycle1.getGear());
		System.out.println("The current speed bicycle1 is in is " + bicycle1.getSpeed());
		
		Bicycle bicycle2 = new Bicycle(2, 4, 6);
		
		System.out.println("The current cadence bicycle2 is in is " + bicycle2.getCadence());
		System.out.println("The current gear bicycle2 is in is " + bicycle2.getGear());
		System.out.println("The current speed bicycle2 is in is " + bicycle2.getSpeed());
		
		bicycle2.setCadence(8);
		bicycle2.setGear(10);
		bicycle2.setSpeed(12);
		
		System.out.println("The current cadence bicycle2 is in is " + bicycle2.getCadence());
		System.out.println("The current gear bicycle2 is in is " + bicycle2.getGear());
		System.out.println("The current speed bicycle2 is in is " + bicycle2.getSpeed());
	}

}
