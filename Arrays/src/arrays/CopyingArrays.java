package arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		//Create a filled array
		char[] copyTo = new char[7];
		//Create an empty array
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		//copyFrom: which array to copy from
		//copyTo: which array to paste into
		//2: where to start copying from in copyFrom
		//0: where to start pasting in copyTo
		//7: where to end copying from in copyFrom
		System.out.println(new String(copyTo));
		//Way to print out the elements of the array
	}
}