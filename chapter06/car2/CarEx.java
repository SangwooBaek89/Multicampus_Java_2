package chapter06.car2;

class Car {
	/*
	 * 생성자 활용하기
	 */
	String name = "SS";
	String color;
	String model;
	int maxSpeed;
	
	public Car() {}
	public Car(String model) {
		this(model, null, null, 0);
	}
	public Car(String model, String color) {
		this(model, color, null, 0);
	}
	public Car(String name, String color, String model, int maxSpeed) {
		super();
		this.name = name;
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}

public class CarEx{
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("H", "black");
		Car car3 = new Car("K", "white", "sonata", 300);
		
		System.out.println(car1.name);
		System.out.println(car2.name+ ", " + car2.model);
		System.out.println(car3.name+ ", " + car3.model +", " + car3.maxSpeed);

		
		
	}
}
