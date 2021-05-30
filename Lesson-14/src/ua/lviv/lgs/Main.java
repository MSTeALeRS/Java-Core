package ua.lviv.lgs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	static void menu() {
		System.out.println("¬вед≥ть 1 додати товар");
		System.out.println("¬вед≥ть 2 ¬идалити товар");
		System.out.println("¬вед≥ть 3 «ам≥нити товар");
		System.out.println("¬вед≥ть 4 —ортувати за назвою");
		System.out.println("¬вед≥ть 5 —ортувати за довжиною");
		System.out.println("¬вед≥ть 6 —ортувати за шириною");
		System.out.println("¬вед≥ть 7 —ортувати за вагою");
		System.out.println("¬вед≥ть 8 вивести ≥-тий елемент");
		System.out.println("¬вед≥ть 9 ¬ийти з програми");

	}

	public static void main(String[] args) {

		LinkedHashSet<Commodity> com1 = new LinkedHashSet<Commodity>();
		com1.add(new Commodity("Rich", 25, 10, 12));
		com1.add(new Commodity("Gold", 18, 25, 25));
		com1.add(new Commodity("Zero", 11, 5, 18));
		com1.add(new Commodity("New", 49, 14, 14));
		com1.add(new Commodity("Combo", 55, 8, 13));
		com1.add(new Commodity("San", 33, 12, 41));

		for (Commodity commodity : com1) {
			System.out.println(commodity);

		}

		System.out.println("After sorting by name");

		TreeSet<Commodity> com = new TreeSet<Commodity>();

		com.add(new Commodity("Rich", 25, 10, 12));
		com.add(new Commodity("Gold", 18, 25, 25));
		com.add(new Commodity("Zero", 11, 5, 18));
		com.add(new Commodity("New", 49, 14, 14));
		com.add(new Commodity("Combo", 55, 8, 13));
		com.add(new Commodity("San", 33, 12, 41));

		System.out.println();

		for (Commodity commodity : com) {

			System.out.println(commodity);

		}
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Press name");

				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();
				System.out.println("Press lenght");
				Scanner sc2 = new Scanner(System.in);
				int lenght = sc2.nextInt();
				System.out.println("Press width");
				Scanner sc3 = new Scanner(System.in);
				int width = sc3.nextInt();
				System.out.println("Press weight");
				Scanner sc4 = new Scanner(System.in);
				int weight = sc4.nextInt();

				com.add(new Commodity(name, lenght, width, weight));

				System.out.println("“овар додано");
				break;

			}
			case "2": {
				System.out.println("Press name");

				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();

				Iterator<Commodity> comIterator = com.iterator();

				while (comIterator.hasNext()) {
					Commodity nextCom = comIterator.next();

					if (nextCom.getName().equalsIgnoreCase(name)) {

						comIterator.remove();

						System.out.println(nextCom + " is deleted");

					}

				}

				break;
			}
			case "3": {

				System.out.println("Press name");

				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();
				System.out.println("Press new name");

				Scanner sc2 = new Scanner(System.in);
				String name2 = sc2.next();

				for (Commodity commodity : com) {
					if (commodity.getName().equalsIgnoreCase(name)) {
						commodity.setName(name2);
						System.out.println("Name is chenged");
					}

				}

				break;
			}
			case "4": {
				TreeSet<Commodity> com2 = new TreeSet<Commodity>(new ComSortByName());

				com2.add(new Commodity("Rich", 25, 10, 12));
				com2.add(new Commodity("Gold", 18, 25, 25));
				com2.add(new Commodity("Zero", 11, 5, 18));
				com2.add(new Commodity("New", 49, 14, 14));
				com2.add(new Commodity("Combo", 55, 8, 13));
				com2.add(new Commodity("San", 33, 12, 41));

				for (Commodity commodity : com2) {

					System.out.println(commodity);

				}
				break;
			}
			case "5": {
				TreeSet<Commodity> com3 = new TreeSet<Commodity>(new ComSortByLenght());

				com3.add(new Commodity("Rich", 25, 10, 12));
				com.add(new Commodity("Gold", 18, 25, 25));
				com3.add(new Commodity("Zero", 11, 5, 18));
				com3.add(new Commodity("New", 49, 14, 14));
				com3.add(new Commodity("Combo", 55, 8, 13));
				com3.add(new Commodity("San", 33, 12, 41));

				for (Commodity commodity : com3) {

					System.out.println(commodity);

				}
				break;
			}
			case "6": {
				TreeSet<Commodity> com4 = new TreeSet<Commodity>(new ComSortByWidth());

				com4.add(new Commodity("Rich", 25, 10, 12));
				com4.add(new Commodity("Gold", 18, 25, 25));
				com4.add(new Commodity("Zero", 11, 5, 18));
				com4.add(new Commodity("New", 49, 14, 14));
				com4.add(new Commodity("Combo", 55, 8, 13));
				com4.add(new Commodity("San", 33, 12, 41));

				for (Commodity commodity : com4) {

					System.out.println(commodity);

				}
				break;
			}
			case "7": {
				TreeSet<Commodity> com5 = new TreeSet<Commodity>(new ComSortByWeight());

				com5.add(new Commodity("Rich", 25, 10, 12));
				com5.add(new Commodity("Gold", 18, 25, 25));
				com5.add(new Commodity("Zero", 11, 5, 18));
				com5.add(new Commodity("New", 49, 14, 14));
				com5.add(new Commodity("Combo", 55, 8, 13));
				com5.add(new Commodity("San", 33, 12, 41));

				for (Commodity commodity : com) {

					System.out.println(commodity);

				}
				break;
			}
			case "8": {
				for (Commodity commodity : com) {

					System.out.println(commodity);

				}
				break;
			}
			case "9": {
				System.exit(0);
				System.out.println("Program is exit");
			}
			}
		}
	}

}
