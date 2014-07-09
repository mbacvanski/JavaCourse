package objects;

import java.util.ArrayList;

public class Point {
	
	int x;
	int y;
	int z;
	
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void move(int deltaX, int deltaY, int deltaZ) {
		x += deltaX;
		y += deltaY;
		z += deltaZ;
	}
	
	public ArrayList<Integer> getLocation() {
		ArrayList<Integer> location = new ArrayList<>();
		location.add(x);
		location.add(y);
		location.add(z);
		return location;
	}
}
