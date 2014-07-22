package anonymousClasses;

public class HelloChukarAnonymousClasses {
	
	interface Chukar {
		public String getName();
		public void setName(String name);
	}
	
	public static void main(String[] args) {
		System.out.println(getName());
	}
	
	public static String getName() {
		/*
		 * chu is a variable that is assigned an instance of the anonymous
		 * class that implements the Chukar interface!
		 */
		
		Chukar chu = new Chukar() { //Makes the anonymous class assigned to chu
			private String name = "";
			//Declare the methods of the interface
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
		};
		
		//Use the variable!
		chu.setName("Chukar");
		return chu.getName();
	}
}
