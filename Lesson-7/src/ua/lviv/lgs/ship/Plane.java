package ua.lviv.lgs.ship;

public abstract class Plane {

	public void engine() {
		int a = (int) (Math.random() * 68) + 20;
		System.out.println("[���������� �������, ��� ����� " + a + "ce�.]");
	}

	public void takeoff() {
		int a = (int) (Math.random() * 1000);
		System.out.println("[���... ��'�� ������ �� " + a + " ��.]");
	}

	public void landing() {
		int a = (int) (Math.random() * 9) + 1;
		System.out.println("˳��� " +toString()+ ", ��� �� ������� �� ����� " + a + "]");
	}

	

}

