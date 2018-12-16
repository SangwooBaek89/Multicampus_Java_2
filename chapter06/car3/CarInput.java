package chapter06.car3;

public class CarInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranNum = (int)(Math.random() * 50) + 1;
		Car myCar = new Car();
		if(myCar.state) {
			myCar.powerOn();
		}
		for(int i = 0; i < ranNum; i ++) {
			myCar.plus(i);
		}
		System.out.println(myCar.result);
	}

}
