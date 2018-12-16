package chapter03_181127;

public class StringConcatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "jdk" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "jdk" + (3 + 3.0);
		String str4 = 3 + 3.0 + "jdk";
		System.out.println(str3);
		System.out.println(str4);
	}

}
