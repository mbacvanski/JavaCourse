package lambdaExpressions;

import java.util.ArrayList;

public class LambdaTest {

	private static ArrayList<Person> people = new ArrayList<>();
	
	static {
		people.add(new Person("Marc", 13, "male"));
		people.add(new Person("Vladimir", 50, "male"));
		people.add(new Person("Twee", 18, "female"));
		people.add(new Person("Chukar", 3, "chukan"));
		people.add(new Person("Chuk", 2, "chukan"));
		people.add(new Person("Andy", 2, "androidian"));
	}
	
	public static void main(String[] args) {
		
		//Get the people who are over 4 years, less than 22, and are male.
		
		System.out.println(printPeople(people, (Person p) -> p.getAge() > 4
				&& p.getAge() < 22
				&& p.getGender().toLowerCase().equals("male")));
		
		//Get the person whose name is Twee
		
		System.out.println(printPeople(people, (Person p) -> p.getName().equals("Twee")));
		
		//Get the people who are male
		
		ArrayList<Person> males = findPeople(people, (Person p) -> p.getGender().equals("male"));
		String peopleList = "";
		for (Person p : males) {
			peopleList += p.getName() + " ";
		}
		System.out.println("Here are the male people:");
		System.out.println(peopleList);
		
		//Get the people who are chukans.
		
		ArrayList<Person> chukans = findPeople(people, (Person p) -> p.getGender().equals("chukan"));
		String chukanList = "";
		for (Person p : chukans) {
			chukanList += p.getName() + " ";
		}
		System.out.println("Here are the chukan people:");
		System.out.println(chukanList);
		
		///////////////////////
		
		ArrayList<Person> peopleOverTwoYears = findPeople(people, (Person p) -> p.getAge() > 2);
		String peopleOverTwoYearsList = "";
		for (Person p : peopleOverTwoYears) {
			peopleOverTwoYearsList += p.getName() + " ";
		}
		System.out.println("Here are the people over two years old;");
		System.out.println(peopleOverTwoYearsList);
	}

	private static String printPeople(ArrayList<Person> people, CheckPerson tester) {
		String names = "";
		
		for (Person p : people) {
			if (tester.test(p)) {
				names += p.getName() + " ";
			}
		}
		return names;
	}
	
	private static ArrayList<Person> findPeople(ArrayList<Person> people, CheckPerson checker) {
		ArrayList<Person> foundPeople = new ArrayList<>();
		
		for (Person p : people) {
			if (checker.test(p)) {
				foundPeople.add(p);
			}
		}
		
		return foundPeople;
	}
}
