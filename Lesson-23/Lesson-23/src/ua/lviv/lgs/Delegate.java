package ua.lviv.lgs;

import java.util.Random;

public class Delegate extends Human {

	private String name;
	private String surname;
	private int age;
	private boolean briber;
	private int acount = 0;

	public Delegate(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = (int) (Math.random() * 40 + 30);
		this.briber = new Random().nextBoolean();

	}

	public void takeBrube(Integer brube) {
		if (isBriber() == true) {
			if (brube > 5000) {
				System.out.println("������!!! ��'����� �������� " + getName() + " " + getSurname() + " ����� " + brube
						+ " ��������!");
			} else {
				this.acount = acount + brube;
				System.out.println("������� " + getName() + " " + getSurname() + " ������� ����� � ����� " + brube);
			}
		} else {
			System.out.println("������� " + getName() + " " + getSurname() + " �� ���� ������");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBriber() {
		return briber;
	}

	public void setBriber(boolean briber) {
		this.briber = briber;
	}

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	@Override
	public String toString() {
		return "Delegate [name=" + name + ", surname=" + surname + " " + super.toString() + ", age=" + age + ", briber="
				+ briber + ", acount=" + acount + "]]";
	}

	public boolean equalsIgnoreCase(String string) {

		return false;
	}

}
