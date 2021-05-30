package ua.lviv.lgs;

import java.util.Comparator;

public class ComSortByWeight implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {

		if (o1.getWeight() > o2.getWeight()) {
			return 1;
		} else if (o1.getWeight() < o2.getWeight()) {
			return -1;
		}

		return 0;
	}
}