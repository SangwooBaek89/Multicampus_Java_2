package chapter03_181127;
import chapter03_method_181127.*;
public class BitShiftEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 << 3 : " + (1 << 3));
		System.out.println("-8 >> 3 : " + (-8 >> 5));
		System.out.println("-8 >>> 3 : " + (-8 >>> 3));
		
		System.out.println(BinaryEx.toBinaryString(1));
		System.out.println(BinaryEx.toBinaryString(-8 >> 3));

	}

}
