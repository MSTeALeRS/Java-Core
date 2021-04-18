package ua.lviv.lgs.ship;

public class PlaneControl extends Su27 {
	
	private int stepMin = 10;
	private int stepMax = 50;
	
	
	
	public void MoveUP() {
		 int a = (int) (Math.random() * stepMax) + stepMin;
		
		System.out.println("[–ухаЇмось вгору на " + a+ "м.]");
	}
	
	public void MoveDown() {
		int a = (int) (Math.random() * stepMax) + stepMin;
		System.out.println("[–ухаЇмось вниз на " + a+ "м.]");
	}
	
	public void MoveLeft() {
		int a = (int) (Math.random() * stepMax) + stepMin;
		System.out.println("[–ухаЇмось вл≥во на " + a+ "м.]");
	}
	
	public void MoveRight() {
		int a = (int) (Math.random() * stepMax) + stepMin;
		System.out.println("[–ухаЇмось вправо на " + a+ "м.]");
	}
	
}
