package graphicObjects;

public class Rectangle extends GraphicObject {
	
	private int xCoordinate;
	private int yCoordinate;
	private int length;
	private int width;
	
	@Override
	public int getXCoordinate() {
		return xCoordinate;
	}

	@Override
	public int getYCoordinate() {
		return yCoordinate;
	}

	@Override
	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	@Override
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	@Override
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public int getWidth() {
		return width;
	}
	
}
