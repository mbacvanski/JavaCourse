package evenMoreClasses;

public class Chukar {
	public static int numberOfChukars;
	private String name;
	
	private Chukar(String name) {
		this.name = name;
	}
	
	//Factory construct
	
	public static Chukar hatch(String name) {
		Chukar newChukar = new Chukar(name);
		return newChukar;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
