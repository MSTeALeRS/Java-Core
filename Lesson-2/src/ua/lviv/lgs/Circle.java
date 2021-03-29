package ua.lviv.lgs;

public class Circle {
	
	private String name;
	private double r;
	private double d;
	private double S;
	private double L;

	Circle (){
		this.name = "Unknown";
	}
	
	Circle (int width) {
		this.name = "Коло";
		this.r = 100;
		this.d = r*2;
		this.S= 3.14*r*r;
		this.L= 3.14*r*2;
	}
	
	
	Circle (String name, int r, int d){
		this.name = name;
		this.r = d/2;
		this.d = 2*r;
		this.S= 3.14*d*d/4;
		this.L= 3.14*r*2;
	}
	
	@Override
	public String toString() {
		return "Ця фігура - " + name + "[радіус = " + r + ", діаметр = " + d + "], Площа[" + S + "], Довжина[" + L + "]" 
				;
	}

}
