package chapter06;

public class fundmentalCal {

	public static void main(String[] args) {
		IntStackEx stackOperand = new IntStackEx();
		CharStackEx stackOperation = new CharStackEx();
		String arr[] = new String[] {"1", "*", "2", "/", "2", "+", "5", "*", "2"};
		
		for(int i = 0; i < arr.length; i++) {
			//연산자일 경우
			char charArr = arr[i].charAt(0);
			if(charArr >= 40 && charArr <= 47) {
				char charStack = (stackOperation.top != -1) ? stackOperation.arr[stackOperation.top] : Character.MIN_VALUE;
				//push할 경우	
				if((charStack == '+' || charStack== '-') && (charArr == '*' || charArr == '/') || stackOperation.top == -1) {
					stackOperation.push(charArr);
				//pop할 경우	
				}else {
					cal(stackOperation, stackOperand);
					stackOperation.push(charArr);
				}
				System.out.println(stackOperation.toString());
				// 숫자일 경우
			} else { 
				stackOperand.push(Integer.parseInt(arr[i]));
				System.out.println(stackOperand);
			}
		}
		//for문 돌고, 스택에 남은 데이터 처리
		while(stackOperation.top > -1) {
			cal(stackOperation, stackOperand);
		}
	}
	
	static void cal(CharStackEx op1, IntStackEx op2) {
		char operation = op1.pop();
		int a = op2.pop();
		int b = op2.pop();
		int result = 0;
		if(operation == '*') result = a * b; 
		if(operation == '/') result = b / a;
		if(operation == '+') result = a + b;
		if(operation == '-') result = b - a;
		op2.push(result);
		System.out.println(op1);
		System.out.println(op2);
	}

}
