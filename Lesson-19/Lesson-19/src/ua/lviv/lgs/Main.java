package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
	
	File file = new File("File1.txt");
	
	Employee em = new Employee("Ivan", 1,  45);
	
	
	System.out.println(em);
	Methods.serialize(em, file);
	
	System.out.println(Methods.deserealize(file));
	
File file1 = new File("File2.txt");
	
	List<Employee> eml = new ArrayList<Employee> ();
	
	eml.add(new Employee ("Tom", 25, 4600));
	eml.add(new Employee ("Sam", 45, 46150));
	eml.add(new Employee ("Ron", 56, 460151));
	eml.add(new Employee ("Cat", 86, 46151));
	System.out.println(eml);
	
	Methods.serializeArr( eml, file1);
	
	System.out.println(Methods.deserealizeArr(file1));


}

	

	
}
