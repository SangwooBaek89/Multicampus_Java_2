package chapter10;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("same object");
		} else {
			System.out.println("different object");
		}
		
		int result = obj1.sum(10, 20);
		System.out.println(result);
	}

}
