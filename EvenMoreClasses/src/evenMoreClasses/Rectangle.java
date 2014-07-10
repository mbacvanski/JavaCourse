package evenMoreClasses;

public class Rectangle {
	private int length;
	private int width;
	private int x;
	private int y;
	private int z;
	
	public Rectangle() {
		this(1, 1); //In-class constructor call
	}
	
	public Rectangle(int length, int width) {
		this(length, width, 0, 0, 0); //In-class constructor call
	}
	
	public Rectangle(int length, int width, int x, int y, int z) {
		this.length = length;
		this.width = width;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
