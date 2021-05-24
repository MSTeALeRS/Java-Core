package ua.lviv.lgs.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		ArrayList<Car> car = new ArrayList<Car>();

		System.out.println(car);

		for (int m = 0; m < getRandomValueFromRange(1, 5); m++) {
			car.add(new Car());

		}

		System.out.println(car.size());

		System.out.println(car);
		Car c = new Car();

		for (int m = 0; m < car.size(); m++) {
			car.set(m, c);

		}
		System.out.println(car);

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
