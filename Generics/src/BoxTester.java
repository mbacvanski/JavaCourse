
public class BoxTester {
	
	private enum boxy {
				SMALL, MEDIUM, LARGE;
			}
			
	public static void main(String[] args) {

		Box<boxy> boxHere = new Box<>();
		boxHere.addItem(boxy.SMALL);
		boxHere.addItem(boxy.SMALL);
		boxHere.addItem(boxy.MEDIUM);
		boxHere.addItem(boxy.LARGE);;
		boxHere.addItem(boxy.LARGE);
		boxHere.addItem(boxy.LARGE);

		System.out.println("The elements are: ");
		
		for (int i = 0; i < boxHere.getSize(); i++) {
			System.out.println(boxHere.getItem(i).name());
		}
		
	}

}
