package ua.lviv.lgs.part2;

import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		Car[][] a = new Car[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];

		System.out.println(Arrays.deepToString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				Car c = new Car();
				a[i][j] = c;
				System.out.println(c);
			}

		}

		System.out.println(Arrays.deepToString(a));

		Car[] s = new Car[getRandomValueFromRange(1, 5)];

		Arrays.fill(s, new Car());

		Arrays.fill(a, s);

		System.out.println();
		System.out.println(Arrays.deepToString(a));
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
