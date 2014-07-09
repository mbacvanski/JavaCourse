package objects;

public class ObjectDemo {

	public static void main(String[] args) {
		//Our fellow test objects
		Point pointHere = new Point(42, 42, 42);
		Rectangle rectHere = new Rectangle(5, 10, 42, 42, 42);
		
		System.out.println("Here is where pointHere is (x, y, z): " + pointHere.getLocation());
		System.out.println("Here is where rectHere is (x, y, z): " + rectHere.getLocation());
		System.out.println("This is rectHere's area: " + rectHere.getArea());
		System.out.println("Here is rectHere's perimeter: " + rectHere.getPerimeter());
		
		System.out.println();
		
		//Manipulating our test objects
		System.out.println("Let's move pointHere 5 units sideways, 10 units upward, and -15 units deep.");
		pointHere.move(5, 10, -15);
		System.out.println("Let's move rectHere -15 units sideways, 10 units upward, and 5 units deep.");
		rectHere.move(-15,  10, 5);
		
		System.out.println();
		
		System.out.println("Here is where pointHere is (x, y, z): " + pointHere.getLocation());
		System.out.println("Here is where rectHere is (x, y, z): " + rectHere.getLocation());
		System.out.println("This is rectHere's area: " + rectHere.getArea());
		System.out.println("Here is rectHere's perimeter: " + rectHere.getPerimeter());
		
		System.out.println();
		
		//More manipulation of one of our test objects
		System.out.println("Let's resize our rectHere, 5 units wider and 10 units longer!");
		rectHere.resize(5, 10);
		System.out.println("This is rectHere's area: " + rectHere.getArea());
		System.out.println("Here is rectHere's perimeter: " + rectHere.getPerimeter());
	}

}
