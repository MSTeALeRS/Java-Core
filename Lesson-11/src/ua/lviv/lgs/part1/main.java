package ua.lviv.lgs.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		Integer[] a = new Integer[20];

		System.out.println(Arrays.deepToString(a));

		for (int i = 0; i < a.length; i++) {

			a[i] = getRandomValueFromRange(1, 100);
		}

		System.out.println(Arrays.deepToString(a));

		Arrays.sort(a);

		System.out.println("Arrays sort asc = " + Arrays.deepToString(a));

		Arrays.sort(a, Collections.reverseOrder());

		System.out.println("Arrays sort desc = " + Arrays.deepToString(a));

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
