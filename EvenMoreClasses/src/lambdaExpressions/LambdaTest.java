package lambdaExpressions;

import java.util.ArrayList;

public class LambdaTest {

	private static ArrayList<Person> people = new ArrayList<>();
	private static ArrayList<Chukar> chukars = new ArrayList<>();
	
	static {
		people.add(new Person("Marc", 13, "male"));
		people.add(new Person("Vladimir", 50, "male"));
		people.add(new Person("Twee", 18, "female"));
		people.add(new Person("Andy", 2, "androidian"));
		people.add(new Person("Luca", 12, "male"));
		people.add(new Person("Kishore", 12, "male"));
		
		chukars.add(new Chukar("Chukar", 3));
		chukars.add(new Chukar("Chuk", 2));
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
		
		//Get the people who are over two years old
		
		ArrayList<Person> peopleOverTwoYears = findPeople(people, (Person p) -> p.getAge() > 2);
		String peopleOverTwoYearsList = "";
		for (Person p : peopleOverTwoYears) {
			peopleOverTwoYearsList += p.getName() + " ";
		}
		System.out.println("Here are the people over two years old:");
		System.out.println(peopleOverTwoYearsList);
		
		//Get the people who are under 18 years old
		//Using generic types!
		
		Predicate<Person> personTest = (Person p) -> p.getAge() < 18; //Using generic type
		ArrayList<Person> peopleUnderEighteen = findPersonsWithPredicate(people, personTest); //Pred is utilized
		String peopleUnderEighteenList = "";
		for (Person p : peopleUnderEighteen) {
			peopleUnderEighteenList += p.getName() + " ";
		}
		System.out.println("Here are the people under 18:");
		System.out.println(peopleUnderEighteenList);
		
		//Get the chukars over 2 years old
		//Using generic types!
		
		Predicate<Chukar> chukarTest = (Chukar c) -> c.getAge() > 2;
		ArrayList<Chukar> chukarsOverTwo = findChukars(chukars, chukarTest);
		String chukarsOverTwoString = "";
		for (Chukar c : chukarsOverTwo) {
			chukarsOverTwoString += c.getName() + " ";
		}
		System.out.println("Here are the chukars over two:");
		System.out.println(chukarsOverTwoString);
		
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
	
	private static ArrayList<Person> findPersonsWithPredicate(ArrayList<Person> people, Predicate<Person> tester) {
		ArrayList<Person> foundPeople = new ArrayList<>();
		
		for (Person p : people) {
			if (tester.test(p)) {
				foundPeople.add(p);
			}
		}
		
		return foundPeople;
	}
	
	private static ArrayList<Chukar> findChukars(ArrayList<Chukar> list, Predicate<Chukar> tester) {
		ArrayList<Chukar> returns = new ArrayList<>();
		
		for (Chukar o : list) {
			if (tester.test(o)) {
				returns.add(o);
			}
		}
		
		return returns;
	}
}