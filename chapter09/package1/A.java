package chapter09.package1;
/*
 * 보통 class는 public
 * field는 private
 * 생성자와 메소드는 public
 */
public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("string");
	
	public A(boolean b) {}
	
	A(int b){
		
	}
	private A(String s) {
		
	}
}
