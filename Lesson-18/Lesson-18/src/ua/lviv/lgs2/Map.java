package ua.lviv.lgs2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map<K, V> {

	HashMap<K, V> map = new HashMap<K, V>();

	public Map() {

	}

	public void addNewObject(K key, V value) {
		map.put(key, value);

		System.out.println(value + " Is add");

	}

	public void deleteObjectByKey(K key) {

		System.out.println(map.get(key) + " Is Deleted");
		map.remove(key);

	}

	public void deleteObjectByValue(V value) {
		Iterator<Entry<K, V>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<K, V> entry = it.next();
			if (value.equals(entry.getValue())) {
				it.remove();
				System.out.println(value + " Is deleted");
			}

		}

	}

	public void selectKey() {

		System.out.println(map.keySet());

	}

	public void selectValues() {

		System.out.println(map.values());
	}

	public void selectAllMAp() {
		System.out.println(map);
	}

	@Override
	public String toString() {
		return "Map [map=" + map + "]";
	}

}
