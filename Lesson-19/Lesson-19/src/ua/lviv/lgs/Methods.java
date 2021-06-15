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
import java.util.ArrayList;
import java.util.List;

public class Methods {
	
	
	
	public static void serialize (Employee em, File file) throws IOException {
		
		
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(em);
		oos.close();
		os.close();
	}
	
	public static Methods  deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois =new ObjectInputStream(is);
		Methods object = (Methods) ois.readObject();
		ois.close();
		is.close();
		
		return object;
	}
	
public static void serializeArr (List<Employee> eml, File file) throws IOException {
		
		
		OutputStream osAr = new FileOutputStream(file);
		ObjectOutputStream oosAr = new ObjectOutputStream(osAr);
		oosAr.writeObject(eml);
		oosAr.close();
		osAr.close();
	}
	
public static List<Employee>  deserealizeArr(File file) throws IOException, ClassNotFoundException {
	InputStream is = new FileInputStream(file);
	ObjectInputStream ois =new ObjectInputStream(is);
	List<Employee> eml = (List<Employee>) ois.readObject();
	ois.close();
	is.close();
	
	return eml;
}
}
