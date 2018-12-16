package chapter07;

class Car{
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println(("no gas"));
			return false;
		}
		System.out.println("gas ok");
		return true;
	}
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("run. left gas : "+gas);
			}else {
				System.out.println("stop. left gas : "+gas);
				break;
			}
		}
	}
}
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setGas(10);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("run");
			myCar.run();
		}
		if(myCar.isLeftGas()){
			
		}
	}

}
