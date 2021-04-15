package ua.lviv.lgs.salary;

public class worker_fixed_month  {
	private int HourInDay = 9;
	private int WorksDay = 20;
	private Salary salary = new Salary();
	
	
	
	public worker_fixed_month (String workername) {
		salary.setWorkername(workername);
	}

	
	public void FixedSalary (Integer sal) {
		
		salary.fsalary(sal*HourInDay*WorksDay);
	}

	
}
