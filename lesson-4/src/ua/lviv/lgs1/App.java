package ua.lviv.lgs1;

public class App {

	public static void main(String[] args) {

		Animal a = new Animal("Jerry", 25, 5);
		System.out.println("Назва тварини = " + a.getName());
		System.out.println("Швидкість тварини =  " + a.getSpeed());
		System.out.println("Вік тварини = " + a.getAge());

		Animal b = new Animal("Леопард", 20, 7);
		System.out.println(b);
		b.setName("Бик");
		b.setSpeed(2);
		b.setAge(14);
		System.out.println(b);
		
	}
}
