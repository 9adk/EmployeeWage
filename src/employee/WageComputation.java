package employee;

public class WageComputation {
	public static void main(String[] args) {
		int full_time = 1;
		int wage_per_hr = 20;
		int emp_wage =0;
		int emp_hrs =0;  
		int empCheck = (int) Math.floor((Math.random() * 10))%2;
		if(empCheck == full_time) {
			emp_hrs = 8;
		}
		emp_wage = wage_per_hr * emp_hrs;
		System.out.println("Employee wage is : "+ emp_wage);
	}
}
