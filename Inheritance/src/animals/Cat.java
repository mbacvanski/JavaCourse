package animals;

public class Cat extends Animal{
	public static void testClassMethod() {
		System.out.println("Static method of Cat subclass");
	}
	
	public void testInstanceMethod() {
		System.out.println("Instance method of Cat subclass");
	}
}
