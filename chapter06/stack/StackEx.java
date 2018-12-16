package chapter06.stack;

class Stack{
	int arr[];
	int top = -1;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	public Stack(int size) {
		arr = new int[size];
	}
	
	public void push(int value) {
		if(top >= arr.length - 1) {
			int []newArr = new int[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
		arr[++top] = value;
	}
	public void pop() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		for(int i = 0; i < top; i++) {
			str += arr[i];
			if(i != top) str += ", ";
		}
		str += "capacity : " + arr.length + ", " +
				"top : " + top + "";
		return str;
	}
	
}

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
