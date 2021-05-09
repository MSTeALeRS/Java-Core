package ua.lviv.lgs;

public class main {

	public static void main(String[] args) {
		

		Methods p = new Methods();
		try {
			p.Plus(-8, -4);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			p.Minus(6, 0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			p.Devine(8, 0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			p.Multiply(5, 5);
		} catch (MyException e) {
		
			e.printStackTrace();
		}
		
	
}

}
