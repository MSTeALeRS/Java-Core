package ua.lviv.lgs.salary;

public class worker_hourly_wage {

	
private Salary salary = new Salary();
	
	
	public worker_hourly_wage (String workername) {
		salary.setWorkername(workername);
	}

	
	public void HourySalary (Integer sal) {
		salary.Hsalary(sal);
	}


}
