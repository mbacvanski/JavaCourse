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
	
	public static String getChukars() {
		String chukarString = "";
		int chukarSize = chukars.size();
		for (int i = 0; i < chukarSize; i++) {
			Chukar c = chukars.get(i);
			if (i == chukarSize - 2) {
				chukarString = chukarString + c.getName() + " & ";
			}
			else if (i == chukarSize - 1) {
				chukarString = chukarString + c.getName();
			}
			else {
				chukarString = chukarString + c.getName() + ", ";
			}
		}
		return chukarString;
	}
}
