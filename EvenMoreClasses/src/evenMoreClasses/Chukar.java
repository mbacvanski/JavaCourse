package evenMoreClasses;

import java.util.ArrayList;

public class Chukar {
	//Static fields
	public static int numberOfChukars;
	public static ArrayList<Chukar> chukars = new ArrayList<Chukar>();
	private String name;
	
	private Chukar(String name) {
		this.name = name;
	}
	
	//Factory construct
	
	public static Chukar hatch(String name) {
		Chukar newChukar = new Chukar(name);
		numberOfChukars ++;
		chukars.add(newChukar);
		return newChukar;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
