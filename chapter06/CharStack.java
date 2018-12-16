package chapter06;

class CharStackEx {
	char[] arr;
	int top;
	
	public CharStackEx() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	
	public CharStackEx(int size) {
		arr = new char[size];
		top = -1;
	}
	
	public void push(char value) {
		if(top == (arr.length - 1)) {
			System.out.println("overflow occur, extend!");
			char newArr[] = new char[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
		arr[++top] = value;
	}
	
	public char pop() {
		if(top == -1) {
			return Character.MIN_VALUE;
		}
		char value = arr[top];
		top--;
		return value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		str = "capacity : " + arr.length + ", top : " + top;
		str += ", stack : [";
		for (int i = 0; i <=top; i++) {
			str += arr[i];
			if(i < top) str += ", ";
		}
		str += "]";
		return str;
	}
}

public class CharStack {
	public static void main(String[] args) {
		CharStackEx stack = new CharStackEx();
		System.out.println(stack);
		stack.push('*');
		System.out.println(stack);

	}
}
