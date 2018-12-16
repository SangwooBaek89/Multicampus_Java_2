package chapter05_181128;

public class SwapEx {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		swap(a, b);
		
		System.out.println(a);
		System.out.println(b);
	}

}
