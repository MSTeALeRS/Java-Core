package ua.lviv.lgs.ship;

public class Su27 extends Plane implements fits {

	private int MaxSpeed = 1500;
	private int length = 22;
	private int width = 15;
	private int weight = 16;
	private int invis = 800;
	private int stepMax = 1000;
	private int bomb = 10;

	public void TurboAcceleration() {
		int a = (int) (Math.random() * stepMax) + MaxSpeed;
		System.out.println("[������� ����������������, �������� = " + a + "��/���.]");
	}

	public void StelsTechnology() {
		int a = (int) (Math.random() * invis);
		System.out.println("[�������������� �������� ���������� " + a + "���.]");
	}

	public void NuclearStrike() {
		int a = (int) (Math.random() * bomb);
		int b = bomb - a;

		System.out.println("[�����, �������� ������� ����, ������� " + a + " ���������, ���������� " + b + "]");
	}

	@Override
	public String toString() {
		return "Su27 [�������=" + length + ", ������=" + width + ", ����=" + weight + "]";
	}

}
