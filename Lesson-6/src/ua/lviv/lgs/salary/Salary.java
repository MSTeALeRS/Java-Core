package ua.lviv.lgs.salary;

public class Salary {
	private String workername;
	
public  void fsalary(int sal) {
	
	System.out.println("[Працівник " + getWorkername() + " отримує " + sal + " грн в місяць]");
}

public  void Hsalary(int sal) {
	System.out.println("[Працівник " + getWorkername() + " отримує " + sal + " грн в годину]");
}

public String getWorkername() {
	return workername;
}

public void setWorkername(String workername) {
	this.workername = workername;
}







}
