package ua.lviv.lgs.part2;

public class Car extends Engine {

	int Horsepower;
	int GraduationYear;

	public Car() {
		super();
		this.Horsepower = (int) (Math.random() * 150 + 50);
		this.GraduationYear = (int) (Math.random() * 70 + 1950);
	}

	@Override
	public String toString() {
		return "Car [Horsepower= " + Horsepower + ", GraduationYear= " + GraduationYear + super.toString() + "]";
	}

}
