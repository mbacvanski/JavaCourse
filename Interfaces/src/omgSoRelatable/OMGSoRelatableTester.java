package omgSoRelatable;

public class OMGSoRelatableTester {

	public static void main(String[] args) {
		SoRelatableTumblr post8600 = new SoRelatableTumblr(7);
		SoRelatableTumblr post8601 = new SoRelatableTumblr(3);
		
		OMGSoRelatable post8600Cast = (OMGSoRelatable)post8600;
		OMGSoRelatable post8601Cast = (OMGSoRelatable)post8601;
		
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
		
	}

}
