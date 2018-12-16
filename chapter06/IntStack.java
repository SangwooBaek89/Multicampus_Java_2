package chapter06;

class IntStackEx {
	int[] arr;
	// 현재 위치 값
	int top;

	public IntStackEx() {
		this(10);
		// 코드 중복 방지
		// arr = new int[10];
	}

	public IntStackEx(int arrSize) {
		arr = new int[arrSize];
		top = -1;
	}

	public void push(int value) {
		if (top == (arr.length - 1)) {
			// 1. full이면 확장
			// 2. 보통 현재 배열 길이의 두 배
			System.out.println("overflow...스택 확장");
			int[] newArr = new int[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			// 3. 참조를 새로운 배열로 바꿈
			arr = newArr;
		}
		arr[++top] = value;
	}

	public int pop() {
		if (top == -1) {
			// 원래 예외 발생 시켜야 함...
			return Integer.MIN_VALUE;
		}
		int value = arr[top];
		top--;
		return value;
	}

	public void clear() {
		top = -1;
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

public class IntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStackEx stack1 = new IntStackEx(2);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);
		stack1.push(1);
		System.out.println(stack1);

	}

}
