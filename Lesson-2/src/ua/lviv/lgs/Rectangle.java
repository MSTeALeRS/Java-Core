package ua.lviv.lgs;

public class Rectangle {

	
	private String name;
	private int width;
	private int Height;
	private int S;
	private int P;
	

	Rectangle (){
		this.name = "Unknown";
	}
	
	Rectangle (int width) {
		this.name = "Прямокутник";
		this.width = 10;
		this.Height = 15;
		this.S=width*Height;
		this.P=(width+Height)*2;
	}
	
	
	Rectangle (String name, int width, int Height){
		this.name = name;
		this.width = width;
		this.Height = Height;
		this.S=width*Height;
		this.P=(width+Height)*2;
	}

	@Override
	public String toString() {
		return "Ця фігура - " + name + ": Розмір [ширина = " + width + ", висота = " + Height + "], Площа[" + S + "], Периметр[" + P + "]" 
				;
	}
	
}
