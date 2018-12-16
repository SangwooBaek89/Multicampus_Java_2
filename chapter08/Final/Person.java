package chapter08.Final;

public class Person {
	final String nation = "korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		// TODO Auto-generated constructor stub
		this.ssn = ssn;
		this.name = name;
	}
}

class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123-123", "hotteok");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
	}

}
