package ua.lviv.lgs.part2;

public abstract class Steering {

	static String material;

	static int WheelDiameter;

	public Steering() {

		this.WheelDiameter = (int) (Math.random() * 9 + 1);

		if (Math.random() * 2 > 1) {
			material = "шкіра";
		} else {
			material = "алькантара";
		}

	}

	public static String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static int getWheelDiameter() {
		return WheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		WheelDiameter = wheelDiameter;
	}

	@Override
	public String toString() {
		return " Кермо [material= " + material + ", WheelDiameter= " + WheelDiameter + "]";
	}

}
