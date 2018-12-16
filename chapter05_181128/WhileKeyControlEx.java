package chapter05_181128;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 || keyCode != 10) {
				System.out.println("-------");
				System.out.println("1.증속, 2.감속, 3.중지");
				System.out.println("-------");
				System.out.println("선택");
			}

			keyCode = System.in.read();
			System.in.read();//buffer 비우기 위해
			System.in.read();//buffer 비우기 위해

			if (keyCode == 49) {
				speed++;
			}
			if (keyCode == 50) {
				speed--;
			}
			if (keyCode == 51) {
				run = false;
			}
			
			System.out.println("speed : " + speed);
		}
		System.out.println("종료");
	}
}