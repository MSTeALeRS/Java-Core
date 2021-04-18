package ua.lviv.lgs.ship;

public abstract class Plane {

	public void engine() {
		int a = (int) (Math.random() * 68) + 20;
		System.out.println("[Запускаемо двигуни, зліт через " + a + "ceк.]");
	}

	public void takeoff() {
		int a = (int) (Math.random() * 1000);
		System.out.println("[Зліт... об'єм палива на " + a + " км.]");
	}

	public void landing() {
		int a = (int) (Math.random() * 9) + 1;
		System.out.println("Літак " +toString()+ ", іде на посадку на смугу " + a + "]");
	}

	

}

