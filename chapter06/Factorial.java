package chapter06;
import chapter06.IntStack;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		IntStackEx stack = new IntStackEx();
		for(int i = 10; i > 0; i--) {
			stack.push(i);
			System.out.println(stack);
		}
		
		while(stack.top != 0) {
			int x = stack.pop(); 
			int y = stack.pop();
			int result = x * y;
			stack.push(result);
			System.out.println(stack);
		}
	}

}
