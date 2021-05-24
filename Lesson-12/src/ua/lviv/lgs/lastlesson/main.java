/*
 * LOGOS It Academy Lesson-9
 * 
 * */

package ua.lviv.lgs.lastlesson;

import java.beans.JavaBean;
import java.lang.reflect.Array;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @since Java 1.8
 * @author Mark
 * @version 1.1
 * 
 * 
 */

public class main {

	/**
	 * @param number of case, seasons, months
	 * @exception WrongInputConsoleParametersException
	 * @author Mark
	 * @return null
	 * @see lesson-9
	 * 
	 */

	/* Menu */
	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����+");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����+");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����+");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����+");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

	public static void main(String[] args) throws Exception {
		ArrayList<Months> mas = new ArrayList<Months>(Arrays.asList(Months.values()));

		ArrayList<Seasons> mas1 = new ArrayList<Seasons>(Arrays.asList(Seasons.values()));

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			/* ���� */
			case "1": {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);

				if (!flag) {
					System.out.println("Months doesnt exist");
				}
				break;
			}
			/* ���� */
			case "2": {
				System.out.println("Enter Seasons");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;

				/* If seasons exist */
				for (Months c : mas) {
					if (c.getSeasons().name().equals(seasons)) {
						flag = true;
					}
				}

				if (flag) {

					for (Months c : mas) {
						if (c.getSeasons().toString().equalsIgnoreCase(seasons)) {
							System.out.println(c);
							System.out.println(c.getMonthday());
						}
					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Season doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;
			}
			/* ���� */
			case "3": {
				System.out.println("Set Months");

				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);

				for (Months c : mas) {
					if (c.name().equals(months)) {

						flag = true;

						for (Months m : mas)
							if (m.name().equals(months))
								for (Months n : mas)
									if (n.getMonthday() == m.getMonthday())

										System.out.println(n.name() + " Have " + n.getMonthday() + " day");

					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Month doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;
			}
			/* ���� */
			case "4": {
				System.out.println("Set Months");

				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);

				for (Months c : mas) {
					if (c.name().equals(months)) {

						flag = true;

						for (Months m : mas)
							if (m.name().equals(months)) {
								System.out.println(m.name() + " Have " + m.getMonthday() + " day");
								for (Months n : mas)
									if (n.getMonthday() < m.getMonthday())

										System.out.println(n.name() + " Have " + n.getMonthday() + " day");

							}
					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Month doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;
			}
			/* ���� */
			case "5": {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = false;

				for (Months c : mas) {
					if (c.name().equals(months)) {

						flag = true;
						for (Months m : mas)
							if (m.name().equals(months))
								if (m.getMonthday() < 30) {
									System.out.println(m.name() + " Have " + m.getMonthday() + " day");
									System.out.println("Others month have more day 29");
									for (Months n : mas)
										if (n.getMonthday() > 29)
											System.out.println(n.name() + " Have " + n.getMonthday() + " day");

								} else if (m.getMonthday() < 31) {
									System.out.println(m.name() + " Have " + m.getMonthday() + " day");
									System.out.println("Others month have more day");
									for (Months n : mas)
										if (n.getMonthday() > 30)
											System.out.println(n.name() + " Have " + n.getMonthday() + " day");

								} else {

									for (Months f : mas)
										if (f.getMonthday() > 31)

										{
											System.out.println(m.name() + " Have " + m.getMonthday() + " day");
											System.out.println("More day have");
											System.out.println(f.name() + " Have " + f.getMonthday() + " Day");

										}

										else if (f.name().equals(months)) {
											System.out.println(f.name() + " Have 31 day");
											System.out.println("It is max day");
										}

								}
					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Month doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;

			}
			/* ���� */
			case "6": {
				System.out.println("Set season");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;
				/* �������� �� ���� ���� ���� */
				for (Months c : mas) {
					if (c.getSeasons().name().equals(seasons)) {
						flag = true;
					}
				}
				/* ���� �������� ���� ���� */
				if (flag) {
					Seasons dir = Seasons.valueOf(seasons);
					int ordinal = dir.ordinal();

					if (ordinal == (mas1.size() - 1)) {
						ordinal = 0;
						System.out.println(mas1.get(ordinal) + " is second season");
					} else {
						System.out.println(mas1.get(ordinal + 1) + " is second season");
					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Season doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;
			}
			/* ���� */
			case "7": {
				System.out.println("Set season");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;
				/* �������� �� ���� ���� ���� */
				for (Months c : mas) {
					if (c.getSeasons().name().equals(seasons)) {
						flag = true;
					}
				}
				/* ���� ���������� ���� ���� */
				if (flag) {
					Seasons dir = Seasons.valueOf(seasons);
					int ordinal = dir.ordinal();

					if (ordinal == 0) {
						ordinal = (mas1.size() - 1);
						System.out.println(mas1.get(ordinal) + " is last season");
					} else {
						System.out.println(mas1.get(ordinal - 1) + " is last season");
					}
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Season doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}

				break;
			}
			/* ���� */
			case "8": {
				/* ���� ������ � ������ ������� ��� */
				for (Months c : mas)
					if (c.getMonthday() % 2 == 0) {
						System.out.println(c.name() + " have " + c.getMonthday() + " days");
					}
				break;
			}
			/* ���� */
			case "9": {
				/* ���� ������ � �� ������ ������� ��� */
				for (Months c : mas)
					if (c.getMonthday() % 2 == 1) {
						System.out.println(c.name() + " have " + c.getMonthday() + " days");
					}
				break;
			}
			/* ���� */
			case "10": {
				System.out.println("Set Months");

				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);
				/* �������� ����� �� �� ����� ������� ��� */
				if (flag) {
					for (Months j : mas)
						if (j.name().equals(months))

							if (j.getMonthday() % 2 == 1) {

								System.out.println(j.name() + " �� ����� � �� " + j.getMonthday() + " ���");

							} else {
								System.out.println(j.name() + " ����� � �� " + j.getMonthday() + " ���");
							}
					flag = true;
				}
				/* Exceptions */
				if (!flag) {
					try {
						String desc = "Month doesnt exist";
						throw new WrongInputConsoleParametersException(desc);
					} catch (WrongInputConsoleParametersException a) {
						a.printStackTrace();

					}
				}
				break;
			}

			}
		}
	}

	/* If months exist */
	private static boolean isMonthsPresent(ArrayList<Months> mas, String months) {
		boolean flag = false;

		for (Months c : mas) {

			if (c.name().equals(months)) {
				System.out.println("Months exist ");
				flag = true;
			}
		}
		return flag;
	}

}
