package ua.lviv.lgs2;

public class app {
	public static void main(String[] args) {

		Map<Integer, String> m = new Map<Integer, String>();

		m.map.put(2, "Dolly");
		m.map.put(1, "Cat");
		m.map.put(12, "Ron");
		m.map.put(4, "Dan");

		m.addNewObject(8, "Tom");
		m.deleteObjectByKey(2);

		m.deleteObjectByValue("Tom");
		m.selectKey();
		m.selectValues();
		m.selectAllMAp();

	}
}
