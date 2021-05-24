package ua.lviv.lgs.lastlesson;

public class WrongInputConsoleParametersException extends Exception {

	private String desc;
	

	
	public WrongInputConsoleParametersException (String desc) {
		super(desc);
		this.desc = desc;
		
	}

	
}
