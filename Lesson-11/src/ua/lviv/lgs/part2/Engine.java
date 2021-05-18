package ua.lviv.lgs.part2;

public abstract class Engine extends Steering {

	int NumberOfCylinders;

	public Engine() {
		super();
		NumberOfCylinders = (int) (Math.random() * 4 + 1);
	}

	public int getNumberOfCylinders() {
		return NumberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		NumberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return " [Engine= " + NumberOfCylinders + " cilinds ]" + super.toString() + "]";
	}

}
