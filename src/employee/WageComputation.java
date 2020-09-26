package employee;

public class WageComputation {
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int wage_per_hr = 20;
	public static final int no_working_days = 20;
	public static void main(String[] args) {
		
		
		int emp_wage =0;
		int emp_hrs =0;  
		int total_empwage = 0;
		for(int day = 0; day < no_working_days; day++) {
			int empCheck = (int) Math.floor((Math.random() * 10))%3;
			switch(empCheck) {
				case full_time: emp_hrs = 8;
						break;
				case part_time: emp_hrs = 4;
						break;
				default: emp_hrs = 0;
						 break;
			}
		
			emp_wage = wage_per_hr * emp_hrs;
			total_empwage += emp_wage; 
		}
		System.out.println("Total Employee wage is : "+ total_empwage);
	}
}
