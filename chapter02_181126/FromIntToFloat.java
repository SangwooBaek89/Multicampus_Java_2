package chapter02_181126;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; //double
		System.out.println(num3); //값 이상 : 가수부분 때문에
		num2 = (int) num3;
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
