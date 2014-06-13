package instanceOf;

public class InstanceOfDemo {

	public static void main(String[] args) {
		Parent parentObject = new Parent();
		Child childObject = new Child();
		System.out.println("Is the parent an instance of a parent? " + (parentObject instanceof Parent));
		System.out.println("Is the parent an instance of a child? " + (parentObject instanceof Child));
		System.out.println("Is the parent an instance of a MyInterface? " + (parentObject instanceof MyInterface));
		System.out.println("Is the child an instance of a parent? " + (childObject instanceof Parent));
		System.out.println("Is the child an instance of a child? " + (childObject instanceof Child));
		System.out.println("Is the child an instance of a MyInterface? " + (childObject instanceof MyInterface));
	}

}
