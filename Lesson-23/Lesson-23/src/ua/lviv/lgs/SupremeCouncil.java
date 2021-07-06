package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;

public class SupremeCouncil {

	private String supname;
	private static SupremeCouncil instanse;
	private ArrayList<Faction> factions = new ArrayList<Faction>();

	private SupremeCouncil(String supname, ArrayList<Faction> factions) {

		this.supname = supname;
		this.factions = factions;
	}

	public static SupremeCouncil getInstanse() {
		if (instanse == null) {
			instanse = new SupremeCouncil("WR", new ArrayList<Faction>());
		}
		return instanse;
	}

	public void addFaction(String factionName) {
		factions.add(new Faction(factionName, new ArrayList<Delegate>()));
		System.out.println("Faction " + factionName + " is added");
	}

	public void deleteFaction(String factionName) {

		Iterator<Faction> factionIterator = factions.iterator();
		while (factionIterator.hasNext()) {
			Faction nextFaction = factionIterator.next();
			if (nextFaction.getFactionName().equalsIgnoreCase(factionName)) {
				factionIterator.remove();
				System.out.println(nextFaction + " is deleted");
				return;
			}

		}
		System.out.println("We can`t find this faction");
	}

	public void selectAllFactions() {
		System.out.println("All Faction");
//		for (Faction faction : factions) {
//			System.out.println("Factions = " + faction);
//		}
		factions.stream().forEach(faction -> System.out.println("Factions = " + faction));
	}

	public void selectFactions(String name) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(name)) {
				faction.selectAllDelegate();
			}

		});
	}
	


	public void addDelegateInFaction(String delegateName, String delegateSurname, String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.addDelegate(delegateName, delegateSurname);
				return;
			} else {
				System.out.println("We can`t find this faction");
			}
		}
		);
	}

	public void deleteDelegateInFaction(String delegateName, String delegateSurname, String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.deleteDelegate(delegateName, delegateSurname);
			}
		}
);
	}

	public void selectBriberInFaction(String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.selectBriberInFaction();
			}
		}
);
	}

	public void selectBestBriberInFaction(String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.selectBestBriberInFaction();
			}
		}
);
	}

	public void selectAllDelegate(String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.selectAllDelegate();
			}
		}
);
	}

	public void clearFaction(String factionName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.clearFaction();
			}
		}
		);
	}

	public void giveBrubeToDelegate(int brube, String delegateName, String delegateSurName, String factioName) {
		factions.stream().forEach(faction -> {
			if (faction.getFactionName().equals(factioName)) {
				faction.giveBrube(brube, delegateName, delegateSurName);
			}
		}
);
	}

	@Override
	public String toString() {
		return " [" + supname + ", " + factions + "]";
	}

}
