package ua.lviv.lgs1;

public class App {

	public static void main(String[] args) {

		Animal a = new Animal("Jerry", 25, 5);
		System.out.println("����� ������� = " + a.getName());
		System.out.println("�������� ������� =  " + a.getSpeed());
		System.out.println("³� ������� = " + a.getAge());

		Animal b = new Animal("�������", 20, 7);
		System.out.println(b);
		b.setName("���");
		b.setSpeed(2);
		b.setAge(14);
		System.out.println(b);
		
	}
}
