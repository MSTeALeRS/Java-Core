package ua.lviv.lgs;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ZooPool implements Comparable<Person> {

	HashMap<Person, ArrayList<Animal>> map;

	public ZooPool() {
		super();

		this.map = new HashMap<Person, ArrayList<Animal>>();
	}

	void addNewPerson(String name, int age) {
		map.put(new Person(name, age), new ArrayList<Animal>());

	}

	void addNewAnimal(String name, String typeAnimal, String animalName) {
		Iterator<java.util.Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			java.util.Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				ArrayList<Animal> value = next.getValue();
				value.add(new Animal(typeAnimal, animalName));

				next.setValue(value);
			}
		}
	}

	void deletePerson(String name) {
		Iterator<java.util.Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			java.util.Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {

				iterator.remove();

			}
		}
	}

	void deleteAnimal(String name, String animalName) {
		Iterator<java.util.Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			java.util.Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				ArrayList<Animal> value = next.getValue();
				Iterator<Animal> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getName().equalsIgnoreCase(animalName)) {
						iterator2.remove();
					}
				}
			}
		}

	}

	void deleteAnimalForAll(String typeAnimal) {
		Iterator<java.util.Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			java.util.Map.Entry<Person, ArrayList<Animal>> next = iterator.next();

			ArrayList<Animal> value = next.getValue();
			Iterator<Animal> iterator3 = value.iterator();
			while (iterator3.hasNext()) {
				Animal next2 = iterator3.next();
				if (next2.getType().equalsIgnoreCase(typeAnimal)) {
					iterator3.remove();
				}
			}

		}

	}

	@Override
	public String toString() {
		return "ZooPool [map=" + map + "]";
	}

	public int compare(Person o1, Person o2) {

		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		}

		return 0;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
