package ua.lviv.lgs;

import java.util.Scanner;



public class main {
	
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
	public static void main(String[] args) {
		Months[] mas = Months.values();
		Seasons[] mas1 = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {

			case "1": {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);

				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;
			}

			case "2": {
				System.out.println("Enter Seasons");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = false;

				for (Months c : mas) {
					if (c.getSeasons().name().equals(months)) {
						flag = true;
					}
				}

				if (flag) {
					
					for (Months c : mas) {
						if (c.getSeasons().toString().equalsIgnoreCase(months)) {
							System.out.println(c);
							System.out.println(c.getMonthday());
						}
					}
				}

				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;
			}

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

				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;
			}

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
				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;
			}
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

				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;

			}

			case "6": {
				System.out.println("Set season");
				sc = new Scanner(System.in);
				String seas = sc.next().toUpperCase();

				boolean flag = false;

				for (Months c : mas) {
					if (c.getSeasons().name().equals(seas)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons dir = Seasons.valueOf(seas);
					int ordinal = dir.ordinal();

					if (ordinal == (mas1.length - 1)) {
						ordinal = 0;
						System.out.println(mas1[ordinal] + " is second season");
					} else {
						System.out.println(mas1[ordinal + 1] + " is second season");
					}
				}

				break;
			}

			case "7": {
				System.out.println("Set season");
				sc = new Scanner(System.in);
				String seas = sc.next().toUpperCase();

				boolean flag = false;

				for (Months c : mas) {
					if (c.getSeasons().name().equals(seas)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons dir = Seasons.valueOf(seas);
					int ordinal = dir.ordinal();

					if (ordinal == 0) {
						ordinal = (mas1.length - 1);
						System.out.println(mas1[ordinal] + " is last season");
					} else {
						System.out.println(mas1[ordinal - 1] + " is last season");
					}
				}

				break;
			}

			case "8": {

				for (Months c : mas)
					if (c.getMonthday() % 2 == 0) {
						System.out.println(c.name() + " have " + c.getMonthday() + " days");
					}
				break;
			}
			case "9": {
				for (Months c : mas)
					if (c.getMonthday() % 2 == 1) {
						System.out.println(c.name() + " have " + c.getMonthday() + " days");
					}
				break;
			}
			case "10": {
				System.out.println("Set Months");

				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, months);

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

				if (!flag) {
					System.out.println("Months doesnt exit");
				}
				break;
			}


			}
		}
	}





private static boolean isMonthsPresent(Months[] mas, String months) {
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
		

