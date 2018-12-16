package chapter06.car1;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		
		System.out.println(yourCar);
		System.out.println("company : " + myCar.company);
		System.out.println("model : " + myCar.model);
		System.out.println("color : " + myCar.color);
		System.out.println("maxSpeed : " + myCar.maxSpeed);
		System.out.println("speed : " + myCar.speed);
		
		myCar.speed = 250;
		System.out.println("speed : " + myCar.speed);
	}

}
