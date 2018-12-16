package chapter03_181127;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90)? 'A' : ((score > 85) ? 'B' : 'C');
		System.out.println(grade);
	}

}
