package omgSoRelatable;

/**
 * 
 * @author marc
 * 
 * Demonstrates the use of an interface as a type and casting.
 * 
 */

public class OMGSoRelatableTester {

	public static void main(String[] args) {
		SoRelatableTumblr post8600 = new SoRelatableTumblr(7);
		SoRelatableTumblr post8601 = new SoRelatableTumblr(3);
		SoRelatableTumblr post8610 = new SoRelatableTumblr(-42);
		//Casting the posts into the OMGSoRelatable interface
		
		OMGSoRelatable post8600Cast = (OMGSoRelatable)post8600;
		OMGSoRelatable post8601Cast = (OMGSoRelatable)post8601;
		
		//#OMG!!!
		//Using the isMoreRelatableThan function that is only accessible as OMGSoRelatable
		
		int relatability = post8600Cast.isMoreRelatableThan(post8601Cast);
		
		if (relatability > 0) {
			System.out.println("Post number 8600 is more relatable than Post number 8601");
		}
		else if (relatability == 0) {
			System.out.println("Post number 8600 is exactly the same relatable than Post number 8601");
		}
		else if (relatability < 0) {
			System.out.println("Post number 8600 is less relatable than Post number 8601");
		}
		
		System.out.println("Is post 8600 relatable? " + post8600.isItRelatable());
		System.out.println("Is post 8601 relatable? " + post8601.isItRelatable());
		System.out.println("Is post 8610 relatable? " + post8610.isItRelatable());
		
	}

}
