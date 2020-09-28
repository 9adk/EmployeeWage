package employee;

public class CompanyEmpWage {
	public final String company;
	public final int empRate;
	public final int noOfWorkingDays;
	public final int hrsPerMonth;
	public int total_empwage;
	
	public CompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		this.company = company;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.hrsPerMonth = hrsPerMonth;
	}
	public int setTotal_EmpWage(int totalempwage) {
		total_empwage = totalempwage;
		return total_empwage;
	}
	public String toString() {
		return "Total Employee Wage for"+ company +" company is "+ total_empwage;
	}
}
