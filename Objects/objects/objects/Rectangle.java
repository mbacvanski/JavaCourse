package objects;

import java.util.ArrayList;

public class Rectangle {
	
	int length;
	int width;
	int x;
	int y;
	int z;
	
	public Rectangle(int length, int width, int x, int y, int z) {
		this.length = length;
		this.width = width;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void move(int deltaX, int deltaY, int deltaZ) {
		x += deltaX;
		y += deltaY;
		z += deltaZ;
	}
	
	public void resize(int lengthIncrease, int widthIncrease) {
		length += lengthIncrease;
		width += widthIncrease;
	}
	
	public int getArea() {
		int area = length * width;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	public ArrayList<Integer> getLocation() {
		ArrayList<Integer> location = new ArrayList<>();
		location.add(x);
		location.add(y);
		location.add(z);
		return location;
	}
}
