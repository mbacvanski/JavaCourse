package lambdaExpressions;

import java.util.ArrayList;

public class PeopleTesting {

	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Vladimir", 50, "male"));
		people.add(new Person("Marc", 12, "male"));
		people.add(new Person("Twee", 18, "female"));

		
		people.sort((a, b) -> a.compareByAge(b));
		
		System.out.println("Sorting by age:");
		System.out.println();
		
		for (Person p : people) {
				System.out.println(p.getName());
		}
		
		System.out.println("-------------------------------------------");
		
		people.add(new Person("Chukar", 3, "chukan"));
		
		people.sort(Person::compareByAge);
		
		System.out.println("Sorting by name:");
		System.out.println();
		
		for (Person p : people) {
			System.out.println(p.getName());
		}
		
		System.out.println("-------------------------------------------");
		
		people.sort(Person::compareByNameLength);
		
		System.out.println("Sorting by name length:");
		System.out.println();
		
		for (Person p : people) {
			System.out.println(p.getName());
		}
		
		System.out.println("-------------------------------------------");

	}
}
