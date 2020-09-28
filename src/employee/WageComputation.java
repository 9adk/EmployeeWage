package employee;

public class WageComputation {
	public static final int full_time = 1;
	public static final int part_time = 2;
	
	private final String company;
	private final int empRate;
	private final int noOfWorkingDays;
	private final int hrsPerMonth;
	private int total_empwage;
	
	public WageComputation(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		this.company = company;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.hrsPerMonth = hrsPerMonth;
	}
	public int calculateWage() {
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
		return total_empwage;
	}
	public String toString() {
		return "Total Employee Wage for"+company+" company is "+total_empwage;
	}
	
	public static void main(String[] args) {
		WageComputation DMart = new WageComputation("D-Mart",20,30,100);
		DMart.calculateWage();
		System.out.println(DMart);
		WageComputation Reliance = new WageComputation("Reliance",25,27,95);
		Reliance.calculateWage();
		System.out.println(Reliance);
		
		}
}
