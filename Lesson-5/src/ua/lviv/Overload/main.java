package ua.lviv.Overload;

public class main {

public static void main(String[] args) {
	
	
	
	This a = new This();
	
	System.out.println(a);
	This b = new This(1, 2);
	System.out.println(a.getR()+b.getH());
	
		
	This c = new This(a.getW()*2, b.getW()*3);
	
	System.out.println(c);
	
	This z = new This(3, 10, 7);
	
	System.out.println(z);
	
	
	
}
}
