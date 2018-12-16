package chapter05_181128;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				if(i == j) System.out.print("1 ");
				else System.out.print("0 ");
			
				//String str = (x == y) ? "1" : "0";
				//sysout(str);
			}
			System.out.println();
		}
	}

}
