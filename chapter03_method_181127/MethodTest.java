package chapter03_method_181127;

public class MethodTest {
	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		System.out.println(sum(a, b));
		System.out.println(avg(a, b));
	}
	static int sum(int a, int b) {
		return a+b;
	}
	static double avg(int a, int b) {
		return sum(a, b) / 2.;
	}
}
