package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class app {

	public static void main(String[] args) throws SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {

		Class<Human> hc = Human.class;

		String nameOfClass = hc.getName();
		System.out.println("Name of class = " + nameOfClass);

		Package classPackage = hc.getPackage();
		System.out.println("Package of current class = " + classPackage);

		Constructor<Human> hum = hc.getConstructor(String.class, int.class, String.class);
		Human newHuman = hum.newInstance("Tom", 25, "Falton");
		System.out.println(newHuman);

		Field groupField = hc.getField("group");
		groupField.set(newHuman, 43);
		System.out.println("Person new age" + newHuman);

		Field[] fields = hc.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

		}

		Field privateLastNameField = fields[0];
		privateLastNameField.setAccessible(true);
		System.out.println("privateb Value = " + privateLastNameField.get(newHuman));

		Method[] methods = hc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);

		}

	}

}
