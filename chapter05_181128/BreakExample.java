package chapter05_181128;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random() * 10) + 1;
			System.out.println(num);
			if(num == 6) break;
		}
		System.out.println("exit");
	}

}
