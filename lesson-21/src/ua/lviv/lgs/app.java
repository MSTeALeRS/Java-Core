package ua.lviv.lgs;

import java.io.File;

public class app {
	public static void main(String[] args) throws Exception {
		File file = new File("Ann.text");
		Person p = new Person("Tom", 25, 148, 84);
		p.saveAnnFields(file);

		System.out.println(Person.deserealize(file));

	}
}
