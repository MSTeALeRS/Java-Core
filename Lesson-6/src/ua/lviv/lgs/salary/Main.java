package ua.lviv.lgs.salary;

public class Main {

	public static void main(String[] args) {
		worker_fixed_month wfm = new worker_fixed_month("Mark"); 
			wfm.FixedSalary(100);
			
			worker_hourly_wage whw = new worker_hourly_wage ("Tom");
			whw.HourySalary(100);
	}

}
