package chapter05_181128;
/*
 * 자바 특성 
 * 메모리 관리 필ㅇ 없음(삭제)
 */
public class StringEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "abcd";
		
		if(str1 == str2) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("문자열이 같음");
		}
		System.out.println("---------");
		
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		if(str3 != str4) System.out.println("다름");
		if(str3.equals(str4)) System.out.println("문자열 같음");
		str4 = str3;
		if(str3 == str4) System.out.println("같음");
		
	}

}
