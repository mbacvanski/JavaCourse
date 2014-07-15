package evenMoreClasses;

public class ChukarDemo {

	public static void main(String[] args) {
		Chukar chu = Chukar.hatch("Chu");
		System.out.println("This is Chu's name: " + chu.getName());
		System.out.println("Let's rename Chu to Chukar-Jeeb.");
		chu.setName("Chukar-Jeeb");
		System.out.println("This is Chu's new name: " + chu.getName());
		Chukar jeeb = Chukar.hatch("Jeeb");
		System.out.println("Another chukar just hatched; his name is Jeeb.");
		System.out.println("There are now " + Chukar.numberOfChukars + " chukars in the world!");
		System.out.println("Their names are " + Chukar.getChukars());
		Chukar joob = Chukar.hatch("Joob");
		System.out.println("Another chukar just hatched; his name is Joob.");
		System.out.println("There are now " + Chukar.numberOfChukars + " chukars in the world!");
		System.out.println("Their names are " + Chukar.getChukars());
	}

}
