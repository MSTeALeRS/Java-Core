package ua.lviv.lgs.salary;

public class Salary {
	private String workername;
	
public  void fsalary(int sal) {
	
	System.out.println("[��������� " + getWorkername() + " ������ " + sal + " ��� � �����]");
}

public  void Hsalary(int sal) {
	System.out.println("[��������� " + getWorkername() + " ������ " + sal + " ��� � ������]");
}

public String getWorkername() {
	return workername;
}

public void setWorkername(String workername) {
	this.workername = workername;
}







}
