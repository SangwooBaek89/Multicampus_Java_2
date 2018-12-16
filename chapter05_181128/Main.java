package chapter05_181128;

import java.io.IOException;

/*
 * 키보드 입력
 * 주기억 장치의 buffer 사용(Keyboard에서 받지X)
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("입력");
		int ch = System.in.read(); //a-> enter시 buffer에 a\r\n 저장
		System.out.println(ch);
		System.out.println((char)ch);
		
		ch = System.in.read(); //입력이 일어나는게 아니라 buffer 참조(\r)
		System.out.println(ch);
		System.out.println((char)ch);
		
		ch = System.in.read(); //버퍼 check
		System.out.println(ch);
		System.out.println((char)ch);
		
		ch = System.in.read(); //버퍼 check -> 비어있으면 키보드 입력 발생
		System.out.println(ch);
		System.out.println((char)ch);
		
	}

}
