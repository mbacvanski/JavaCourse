package animals;

public class AnimalsTester {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Cat cat1 = new Cat();
		
		System.out.println("This is the animal's instance method:");
		animal1.testInstanceMethod();
		System.out.println();
		System.out.println("This is the animal's class method:");
		Animal.testClassMethod();
		System.out.println();
		System.out.println("This is the cat's instance method:");
		cat1.testInstanceMethod();
		System.out.println();
		System.out.println("This is the cat's class method:");
		Cat.testClassMethod();
		System.out.println();
		
		Animal myAnimal = cat1;
		myAnimal.testInstanceMethod();
		myAnimal.testClassMethod();
	}

}
