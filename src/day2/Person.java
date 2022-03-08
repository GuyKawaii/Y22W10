package day2;

public class Person {
	private final String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void hasBirthday() {
		this.age += 1;
	}
	
	@Override
	public String toString() {
		return this.name + " has age " + this.age;
	}
}
