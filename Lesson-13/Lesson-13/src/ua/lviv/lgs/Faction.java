package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Faction {

	private String factionName;

	private ArrayList<Delegate> delegates = new ArrayList<Delegate>();

	public Faction(String factionName, ArrayList<Delegate> delegates) {
		super();
		this.factionName = factionName;
		this.delegates = delegates;

	}

	public void giveBrube(int brube, String delegateName, String delegateSurName) {
		for (Delegate m : delegates) {
			if (m.getName().equals(delegateName) && m.getSurname().equals(delegateSurName)) {
				m.takeBrube(brube);
				return;
			}

		}
		System.out.println("We can`t find ");
	}

	public void addDelegate(String delegateName, String delegateSurname) {
		delegates.add(new Delegate(delegateName, delegateSurname));
		System.out.println("Delegate added");
		System.out.println("Список депутатів оновлено");

		for (Delegate delegate : delegates) {
			System.out.println(delegate);
		}

	}

	public void deleteDelegate(String delegateName, String delegateSurname) {
		Iterator<Delegate> delegateIterator = delegates.iterator();
		while (delegateIterator.hasNext()) {
			Delegate nextDelegate = delegateIterator.next();

			if (nextDelegate.getName().equalsIgnoreCase(delegateName)) {

				if (nextDelegate.getSurname().equalsIgnoreCase(delegateSurname)) {
					delegateIterator.remove();
					System.out.println(nextDelegate + " is deleted");
					return;
				}

			}

		}

		System.out.println("Can`t find delegate");

	}

	public void selectBriberInFaction() {
		for (Delegate delegate : delegates) {
			if (delegate.isBriber() == true) {

				System.out.println(delegate.toString());

			}
			return;
		}
		System.out.println("Хабарників не знайдено");
	}

	public void selectBestBriberInFaction() {
		Collections.sort(delegates, new DelegateSorting());
		delegates.get(delegates.size() - 1);
		{
			System.out.println(delegates.get(delegates.size() - 1) + " is best briber");

		}

	}

	public void selectAllDelegate() {
		for (Delegate delegate : delegates) {
			System.out.println(delegate);
		}

	}

	public void clearFaction() {
		delegates.clear();
		System.out.println("Clear Faction");
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	@Override
	public String toString() {
		return "Faction [FactionName=" + factionName + ", delegates=" + delegates + "]";
	}

	public boolean contains(String string) {

		return false;
	}

}
