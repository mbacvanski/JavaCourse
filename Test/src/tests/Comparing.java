package tests;

import java.util.ArrayList;
import java.util.Collections;

public class Comparing {

	public static void main(String[] args) {
		Jeeb j1 = new Jeeb("Chukar", "home");
		Jeeb j2 = new Jeeb("Piggy", "Sofa");
		Jeeb j3 = new Jeeb("Android", "couch");

		ArrayList<Jeeb> jeebs = new ArrayList<>();
		jeebs.add(j1);
		jeebs.add(j2);
		jeebs.add(j3);
		
		Collections.sort(jeebs);
		System.out.println(jeebs.get(0).getName());
		System.out.println(jeebs.get(1).getName());
		System.out.println(jeebs.get(2).getName());
	}

}
