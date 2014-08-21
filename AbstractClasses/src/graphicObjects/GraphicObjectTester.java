package graphicObjects;

public class GraphicObjectTester {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		rect.setXCoordinate(42);
		rect.setYCoordinate(35);
		rect.setWidth(10);
		rect.setLength(23);
		System.out.println("This is the length of the rectangle: " + rect.getLength());
		System.out.println("This is the width of the rectangle: " + rect.getWidth());
		System.out.println("This is the location of the rectangle: " + rect.getXCoordinate() + ", " + rect.getYCoordinate());
		
	}

}
