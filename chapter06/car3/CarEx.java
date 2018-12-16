package chapter06.car3;
class Car{
	double result;
	boolean state;
	Car(){
		System.out.println("current state : off");
		
	}
	void powerOn() {
		System.out.println("turn on");
		state = true;
	}
	void  powerOff() {
		System.out.println("turn off");
		state = false;
	}
	double plus(int x, int y) {
		result = (double)x + y; 
		return result;
	}
	double plus(int x) {
		result += (double)x;
		return result;
	}
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	void clear() {
		powerOff();
		result = 0;
	}
	/*//마지막에 작성
	@Override
	public void toString() {
		// TODO Auto-generated method stub
		System.out.println("cal state : " + state + ", " + result);
	}*/
}
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		if(car1.state) {
			car1.powerOn();
		}
		
		System.out.println(car1.plus(10, 10));
		System.out.println(car1.divide(10, 10));
		car1.powerOff();
		
	}

}
