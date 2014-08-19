package interfaceMethods;

public class Chukar extends Bird implements Flyer, Mythical{
	public static void main(String[] args) {
		Chukar chukar = new Chukar();
		System.out.println(chukar.identifyMyself());
	}
}
