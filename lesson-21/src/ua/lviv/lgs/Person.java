package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

public class Person implements Serializable {

	@ann(param = "Person - name annotation")
	private String name;
	@ann(param = "Person - age annotation")
	private int age;
	@ann(param = "Person - height annotation")
	private int height;
	private int width;

	public Person() {
		super();
	}

	public Person(String name, int age, int height, int width) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void saveAnnFields(File file) throws Exception {

		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		Person person = new Person();

		Field[] fields = this.getClass().getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(ann.class) instanceof ann) {
				field.set(person, field.get(this));
			}
		}

		oos.writeObject(person);
		oos.close();
		os.close();

		System.out.print("Saved --->");
		System.out.println(person);

	}

	public static Person deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Person object = (Person) ois.readObject();
		ois.close();
		is.close();

		return object;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", width=" + width + "]";
	}

}
