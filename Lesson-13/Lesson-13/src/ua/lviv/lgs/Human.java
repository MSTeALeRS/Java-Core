package ua.lviv.lgs;

public class Human {

	int weight;
	int height;

	public Human() {
		super();
		this.weight = (int) (Math.random() * 20 + 40);
		this.height = (int) (Math.random() * 50 + 120);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "[weight=" + weight + ", height=" + height + " ";
	}

}
