package chapter04_181127;
/*
 * [A, B] -> a이상 b이하
 * 
 */
public class RockSissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int me = 0;
		int com = setCom(); 
		int result = checkWinner(com, me);
		
		System.out.println("com : " + com);
		System.out.println("me : " + me);
		
		if(result == 0) System.out.println("비겼습니다.");
		if(result == 1) System.out.println("이겼습니다.");
		if(result == -1) System.out.println("졌습니다.");
	}
	
	//com, me 가위바위보 비교
	static int checkWinner(int com, int me) {
		int checkWinner = com - me;

		if (checkWinner == 0) {
			return 0;
		} else{
			if (checkWinner == -1 || checkWinner == 2) return -1;
			else if (checkWinner == 1 || checkWinner == -2) return 1;
			return 0;
		}
	}
	// com 확률로 뽑기
	static int setCom() {
		int num = (int) (Math.random() * 10);
		int com = 2;
		if (num >= 0 && num < 2)
			com = 0;
		if (num >= 2 && num < 5)
			com = 1;
		return com;
	}
}
