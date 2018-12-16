package chapter03_181127;
import chapter03_method_181127.BinaryEx;
public class BitCalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 70;
		int b = 12;
		int c = 112;
		int d = 130;
		int result = a << 24 | b << 16 | c << 8 | d; 
		String binary_res = BinaryEx.toBinaryString(result);
		System.out.println(result);
		System.out.println(binary_res);
		

		int A= (result & 0xFF000000) >> 24; //2진수로 표현이 길 때 --- 16진수로
		int B = (result & 0x00FF0000) >> 16;
		int C = (result & 0x0000FF00) >> 8;
		int D = (result & 0x000000FF);
		System.out.println();
		System.out.println(A + ", " + B + ", " + C + ", " + D);
	
		
	}

}
