package arrays;

public class MultiDimArrays {

	public static void main(String[] args) {
		String[][] names = {
				{"Marc", "Wen", "Kishore", "Vladimir"},
				{"Bacvanski", "Gong", "Srinivas", "Bacvanski"}				
		};
		
		System.out.println(names[0][0] + " " + names[1][0]);
		System.out.println(names[0][1] + " " + names[1][1]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][3]);

	}

}
