package chapter02_181126;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10, 20 역시 Interger... Interger -> byte ???
		//초기화시 정수Liter의 범위를 알기 때문, 그러나 변수는 X
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// + 연산 시 Interger로 자동 형변환
		int intValue1 = byteValue1 + byteValue2;
		//byte byteValue3 = byteValue1 + byteValue2;
		
		System.out.println(intValue1);
		
		//int로 자동 형변환
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int charValue4 = charValue1 + charValue2;
		
		System.out.println(charValue2);
		System.out.println("unicode : " + charValue4);
		System.out.println("character : " + (char) charValue4);
		
		int intValue10 = 10;
		long intValue11 = intValue10 / 4L; //정수/정수 -> 몫만
		System.out.println(intValue11);
		
	}

}