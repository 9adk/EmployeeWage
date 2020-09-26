package employee;

public class WageComputation {
	public static void main(String[] args) {
		int full_time = 1;
		int part_time = 2;
		int wage_per_hr = 20;
		int emp_wage =0;
		int emp_hrs =0;  
		int empCheck = (int) Math.floor((Math.random() * 10))%3;
		switch(empCheck) {
			case 1: emp_hrs = 8;
					break;
			case 2: emp_hrs = 4;
					break;
			default: emp_hrs = 0;
					 break;
		}
		emp_wage = wage_per_hr * emp_hrs;
		System.out.println("Employee wage is : "+ emp_wage);
	}
}
