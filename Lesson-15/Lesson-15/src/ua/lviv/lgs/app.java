package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class app {

	static void menu() {
		System.out.println("Введіть 1 Додати учасника клубу");
		System.out.println("Введіть 2 Додати тваринку до учасника клубу");
		System.out.println("Введіть 3 Видалити тваринку з учасника клубу");
		System.out.println("Введіть 4 Видалити учасника з клубу");
		System.out.println("Введіть 5 Видалити конкретну тваринку зі всіх власників");
		System.out.println("Введіть 6 Вивести на екран зооклуб");
		System.out.println("Введіть 7 Вийти з програми");

	}

	public static void main(String[] args) {

		ZooPool z = new ZooPool();

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Set name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next().toUpperCase();
				System.out.println("Set age");
				Scanner sc2 = new Scanner(System.in);
				int age = sc2.nextInt();
				z.addNewPerson(name, age);
				break;
			}
			case "2": {
				System.out.println("Set hostName");
				Scanner sc1 = new Scanner(System.in);
				String hname = sc1.next().toUpperCase();
				System.out.println("Set typeAnimal");
				Scanner sc2 = new Scanner(System.in);
				String typeA = sc2.next().toUpperCase();
				System.out.println("Set nameAnimal");
				Scanner sc3 = new Scanner(System.in);
				String nameA = sc3.next().toUpperCase();

				z.addNewAnimal(hname, typeA, nameA);
				break;
			}
			case "3": {
				System.out.println("Set hostName");
				Scanner sc1 = new Scanner(System.in);
				String hname = sc1.next().toUpperCase();
				System.out.println("Set nameAnimal");
				Scanner sc3 = new Scanner(System.in);
				String nameA = sc3.next().toUpperCase();
				z.deleteAnimal(hname, nameA);
				break;
			}
			case "4": {
				System.out.println("Set Name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next().toUpperCase();
				z.deletePerson(name);
				break;
			}
			case "5": {
				System.out.println("Set typeAnimal");
				Scanner sc2 = new Scanner(System.in);
				String typeA = sc2.next().toUpperCase();
				z.deleteAnimalForAll(typeA);
				break;
			}
			case "6": {
				Iterator<java.util.Map.Entry<Person, ArrayList<Animal>>> iterator = z.map.entrySet().iterator();

				while (iterator.hasNext()) {
					java.util.Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
					System.out.println(next);
				}
				break;
			}
			case "7": {
				System.exit(0);
				System.out.println("Program is exit");
			}

			}
		}

	}

}
