package evenMoreClasses;

public class ChukarDemo {

	public static void main(String[] args) {
		Chukar chu = Chukar.hatch("Chu");
		System.out.println("This is Chu's name: " + chu.getName());
		System.out.println("Let's rename Chu to Chukar-Jeeb.");
		chu.setName("Chukar-Jeeb");
		System.out.println("This is Chu's new name: " + chu.getName());
	}

}
