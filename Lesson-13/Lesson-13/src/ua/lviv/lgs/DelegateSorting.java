package ua.lviv.lgs;

import java.util.Comparator;

public class DelegateSorting implements Comparator<Delegate> {

	@Override
	public int compare(Delegate o1, Delegate o2) {

		return o1.getAcount() > o2.getAcount() ? 1 : -1;
	}

}
