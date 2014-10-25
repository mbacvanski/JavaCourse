package MultipleTypeParameters;

public class OrderedPairTester {

	
	public static void main(String[] args) {

		OrderedPair<Integer, String> integerString = new OrderedPair<>(0, "Hello");
		OrderedPair<String, Integer> stringInteger = new OrderedPair<String, Integer>("World", 1);
		OrderedPair<String, String> stringString = new OrderedPair<String, String>("Hi", "Chukar");
		
		System.out.println("This is the key from the integerString ordered pair: " + integerString.getKey());
		System.out.println("This is the value from the integerString ordered pair: " + integerString.getValue());
		System.out.println();
		System.out.println("This is the key from the stringInteger ordered pair: " + stringInteger.getKey());
		System.out.println("This is the value from the stringInteger ordered pair: " + stringInteger.getValue());
		System.out.println();
		System.out.println("This is the key from the stringString ordered pair: " + stringString.getKey());
		System.out.println("This is the value from the stringString ordered pair: " + stringString.getValue());
	}

}
