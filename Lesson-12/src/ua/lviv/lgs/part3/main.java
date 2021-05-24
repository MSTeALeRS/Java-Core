package ua.lviv.lgs.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static void menu() {
		System.out.println("Press 1 to -add()");
		System.out.println("Press 2 to -remove(index)");
		System.out.println("Press 3 to end");

	}

	public static void main(String[] args) {

		ArrayList<Human> a = new ArrayList<Human>();

		a.add(new Human("Tom", 25));

		Scanner m = new Scanner(System.in);

		while (true) {

			menu();
			switch (m.next()) {
			case "1": {
				System.out.println("Set new name");

				String name = m.next().toUpperCase();

				System.out.println("Set age");
				Scanner ag = new Scanner(System.in);
				int age = ag.nextInt();

				a.add(new Human(name, age));

				System.out.println(a);
				break;
			}

			case "2": {

				System.out.println("Press 1-" + a.size() + " number");

				Scanner rem = new Scanner(System.in);

				int remo = rem.nextInt();
				System.out.println(a.get(remo - 1) + " is deleted");
				a.remove(remo - 1);

				System.out.println(a);

				break;
			}
			case "3": {
				System.err.println("Programm is end");

				a.clear();
				break;
			}
			}

		}

	}
}
