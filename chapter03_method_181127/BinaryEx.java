package chapter03_method_181127;

public class BinaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2진수로...
		
	}
	public static String toBinaryString(int value) {
		
		String std = Integer.toBinaryString(-1);
		String str = Integer.toBinaryString(value);
		
		while(str.length() < std.length())
			str = "0" + str;
		
		return str;
	}

}
