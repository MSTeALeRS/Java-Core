package ua.lviv.lgs;

public class MyException extends Exception {
	
	private String desc;
	
	

	public MyException (String desc) {
		super(desc);
		this.desc = desc;
		
	}

	
	
	

}
