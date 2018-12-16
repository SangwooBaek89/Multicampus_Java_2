package chapter05_181128;
//ctrl shift o - import 
import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("msg 입력");
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		System.out.println("exit");
	}
}
