package lambdaExpressions;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int compareByAge(Person p) {

		if (this.age < p.getAge()) {
			return -1;
		}
		else if (this.age == p.getAge()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public int compareByNameLength(Person p) {
		if (this.name.length() < p.name.length()) {
			return -1;
		}
		else if (this.name.length() == p.name.length()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}