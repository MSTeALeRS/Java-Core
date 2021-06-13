package ua.lviv.lgs;


import java.util.List;

public class Testclass<T> {
	
	
		public  <T> List addItem(List<T> list, Object value) {
			list.add((T) value);
			return list;
		}
		
	

		
	}

