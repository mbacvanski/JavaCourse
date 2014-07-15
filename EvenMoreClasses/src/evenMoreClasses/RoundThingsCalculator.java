package evenMoreClasses;

public class RoundThingsCalculator {
	private static final double PI = 3.14159265358979323846264338327950781;
	private static double tau = 0;
	
	/*
	 * Static Initializer
	 * Works only once, right before everything!
	 */
	static {
		System.out.println("Starting Static Initialization Block");
		initializeIt();
		System.out.println("Finished Static Initialization Block");
	}
	
	
	/**
	 * Initializer
	 * Better than having everything in the static block
	 * It's easier to test and run stand alone,
	 * whereas the static block can only be run once 
	 * before the execution of the program.
	 */
	private static void initializeIt() {
		tau = PI * 2;
	}
	
	/**
	//Not so good: initializer should only set up state!
	private static double initializeIt() {
		tau = PI * 2;
		return tau;
	}
	**/
	
	
	/*
	 * Object Initializer
	 * Works every time an object is created!
	 */
	{ 
		System.out.println("Starting object initializer");
		System.out.println("Finished object initializer");
	}
	
	/*
	 * Constructor
	 * Works every time an object is created,
	 * but only after the object initializer.
	 */
	public RoundThingsCalculator() {
		System.out.println("Starting constructor");
		tau = PI * 2;
		System.out.println("Finished constructor");
	}
	/*
	 * Main function
	 * Works every time it's called.
	 */
	public static void main(String[] args) {
		System.out.println("Starting main");
		for (String s : args) {
			System.out.print(s + " "); //Accepts string input
		}
		System.out.println("The area of a 42 unit radius circle is: " + calculateCircleAreaDiameter(42));
		System.out.println("Finished main");
	}
	
	private static double calculateCircleAreaRadius(double radius) {
		System.out.println("Starting calculateCircleAreaRadius");
		double area = 0;
		if (radius > 0) {
			area = (Math.pow(radius, 2)) * PI;
			System.out.println("Finished calculateCircleAreaRadius");
			return area;
		}
		else {
			System.out.println("Finished calculateCircleAreaRadius");
			return 0;
		}
	}
	
	private static double calculateCircleAreaDiameter(double diameter) {
		System.out.println("Starting calculateCircleAreaDiameter");
		double area = 0;
		double radius = diameter / 2;
		if (radius > 0) {
			area = (Math.pow(radius , 2)) * PI;
			System.out.println("Finished calculateCircleAreaDiameter");
			return area;
		}
		else {
			System.out.println("Finished calculateCircleAreaDiameter");
			return 0;
		}
	}
	
	private static double calculateCircleCircumferenceRadius(double radius) {
		System.out.println("Starting calculateCircleCircumferenceRadius");
		double circumference = 0;
		if (radius > 0) {
			circumference = radius * tau;
		}
		System.out.println("Finished calculateCircleCircumferenceRadius");
		return circumference;
	}
}
