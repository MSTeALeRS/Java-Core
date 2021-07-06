package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

	static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		System.err.println("������ 10 ��� ���� ����� (������ �� ���� � �������)");

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
