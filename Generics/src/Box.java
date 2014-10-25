import java.util.ArrayList;


public class Box<T> {
	
	ArrayList<T> thingsInBox = new ArrayList<>();
	
	public Box(){};
	public void addItem(T item) {
		thingsInBox.add(item);
	}
	
	public T getItem(int index) {
		return thingsInBox.get(index);
	}
	
	public int getSize() {
		return thingsInBox.size();
	}
}
