package ua.lviv.lgs.part2;

public abstract class SteeringMaterial {

	String material;

	public SteeringMaterial() {

		if (Math.random() * 2 > 1) {
			material = "шкіра";
		} else {
			material = "алькантара";
		}

	}

	@Override
	public String toString() {
		return "[material=" + material + "]";
	}

}
