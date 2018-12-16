package chapter05_181128;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num = 1;
		
		do {
			int i = 1;
			do {
				if(i != 1 && i != num) {
					if(num % i == 0) {
						System.out.println(num+"은 소수가 아님");
						break;
					}
				}
				if(i == num) System.out.println(num+"은 소수입니다");
				i++;
			}while(i <= num);
			num++;
		}while(num < 323);
		*/
		
		int num = 1;
		while(num < 323) {
			for(int i = 2; i <= num; i++) {
				if(i != num && num % i == 0) {
					System.out.println(num + "은 소수 아님");
					break;
				}
				if(i == num) {
					System.out.println(num + "은 소수");
				}
			}
			num++;
		}
		
	}
}
