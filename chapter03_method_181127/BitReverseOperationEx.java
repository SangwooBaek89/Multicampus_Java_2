package chapter03_method_181127;

public class BitReverseOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ##보수의 개념 ##이 되기 위해 채워넣어야 할 수 Ex) 2, 3의 보수 - 1 / 1, 3의 보수 - 2
		 */
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1; // v2 + 1;

		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		System.out.println(Integer.toBinaryString(v3) + ", " + v3);
	}

}
