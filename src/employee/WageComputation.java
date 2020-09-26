package employee;

public class WageComputation {
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int wage_per_hr = 20;
	public static final int no_working_days = 20;
	public static final int max_hrs_in_month = 100;
	public static void main(String[] args) {
		
		int total_empwage = 0;
		int total_emp_hrs = 0;
		int total_working_days = 0;
		while(total_emp_hrs < max_hrs_in_month 
				&& total_working_days < no_working_days) {
			total_working_days++;
			int emp_hrs = 0;
			int empCheck = (int) Math.floor((Math.random() * 10))%3;
			switch(empCheck) {
				case full_time: emp_hrs = 8;
						break;
				case part_time: emp_hrs = 4;
						break;
				default: emp_hrs = 0;
						 break;
			}
		
			total_emp_hrs += emp_hrs; 
			int emp_wage = emp_hrs * wage_per_hr;
			total_empwage += emp_wage; 
			System.out.println("Employee Wage : "+ emp_wage);
			}
		System.out.println("Total employee wage : "+ total_empwage);
		}
}
