package ua.lviv.lgs.part3;

public class Human {
	
	

	String name;
	int age;
	
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
