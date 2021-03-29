package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
//		c=2pR and c=pd
//	    S=pR2 and S=pd2/4
		
//		System.out.println("eeee");
		
		
		Rectangle a1 = new Rectangle();
		
		Rectangle a2 = new Rectangle (10);
		
		Rectangle a3 = new Rectangle ("Квадрат", 5, 5);
		
		
		Circle b1 = new Circle();
					
		Circle b2 = new Circle (10);
		
		Circle b3 = new Circle ("Коло", 5, 10);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}


