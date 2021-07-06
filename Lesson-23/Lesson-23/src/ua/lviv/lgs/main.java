package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

	static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.err.println("Введіть 10 щоб дати хабар (чомусь не було у завданні)");

	}

	public static void main(String[] args) {

		SupremeCouncil supreme = SupremeCouncil.getInstanse();

		Scanner sc = new Scanner(System.in);

		while (true) {

			menu();
			switch (sc.next()) {

			case "1": {
				System.out.println("Press Faction");
				Scanner sc1 = new Scanner(System.in);
				String sc2 = sc1.next().toUpperCase();

				supreme.addFaction(sc2);
				break;
			}
			case "2": {
				System.out.println("Press Faction");
				Scanner sc1 = new Scanner(System.in);
				String sc2 = sc1.next();
				supreme.deleteFaction(sc2);
				break;
			}
			case "3": {
				supreme.selectAllFactions();
				break;
			}
			case "4": {
				System.out.println("Press Faction");
				Scanner sc1 = new Scanner(System.in);
				String sc2 = sc1.next();
				supreme.clearFaction(sc2);
				break;
			}
			case "5": {
				System.out.println("Press Faction");
				Scanner sc1 = new Scanner(System.in);
				String sc2 = sc1.next();
				supreme.selectFactions(sc2);
				break;
			}
			case "6": {
				System.out.println("Press Name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next().toUpperCase();
				System.out.println("Press Surname");
				Scanner sc2 = new Scanner(System.in);
				String surname = sc2.next().toUpperCase();
				System.out.println("Press Faction");
				Scanner sc3 = new Scanner(System.in);
				String faction = sc3.next().toUpperCase();

				supreme.addDelegateInFaction(name, surname, faction);
				break;
			}
			case "7": {
				System.out.println("Press Name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();
				System.out.println("Press Surname");
				Scanner sc2 = new Scanner(System.in);
				String surname = sc2.next();
				System.out.println("Press Faction");
				Scanner sc3 = new Scanner(System.in);
				String faction = sc3.next();

				supreme.deleteDelegateInFaction(name, surname, faction);
				;
				break;
			}
			case "8": {
				System.out.println("Press Faction");
				Scanner sc3 = new Scanner(System.in);
				String faction = sc3.next();
				supreme.selectBriberInFaction(faction);
				break;
			}
			case "9": {
				System.out.println("Press Faction");
				Scanner sc3 = new Scanner(System.in);
				String faction = sc3.next().toUpperCase();
				supreme.selectBestBriberInFaction(faction);
				break;
			}
			case "10": {
				System.err.println("Press sum brube");
				Scanner br = new Scanner(System.in);
				Integer brube = br.nextInt();
				System.err.println("Press Name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next().toUpperCase();
				System.err.println("Press Surname");
				Scanner sc2 = new Scanner(System.in);
				String surname = sc2.next().toUpperCase();
				System.err.println("Press Faction");
				Scanner sc3 = new Scanner(System.in);
				String faction = sc3.next().toUpperCase();
				supreme.giveBrubeToDelegate(brube, name, surname, faction);
				break;
			}
			}
		}
	}

}
