package employee;

public class WageComputation {
	public static final int full_time = 1;
	public static final int part_time = 2;
	
	
	public static int calculateWage(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		int total_empwage = 0;
		int total_emp_hrs = 0;
		int total_working_days = 0;
		while(total_emp_hrs < hrsPerMonth 
				&& total_working_days < noOfWorkingDays) {
			
			int emp_hrs = 0;
			int empCheck = (int) Math.floor((Math.random() * 10))%3;
			switch(empCheck) {
				case full_time: emp_hrs = 8;
								total_working_days++;
						break;
				case part_time: emp_hrs = 4;
								total_working_days++;
						break;
				default: emp_hrs = 0;
						 break;
			}
		
			total_emp_hrs += emp_hrs; 
			int emp_wage = emp_hrs * empRate;
			total_empwage += emp_wage; 
			}
		System.out.println("Employee wage for "+company+" company is "+total_empwage);
		return total_empwage;
	}
	
	public static void main(String[] args) {
		
		calculateWage("D-Mart",20,30,100);
		calculateWage("Reliance",25,27,90);
		}
}
