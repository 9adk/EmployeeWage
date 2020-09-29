package employee;
import java.util.*;
public class WageComputation implements CompanyEmployeeWage {
	public static final int full_time = 1;
	public static final int part_time = 2;
	
	private List<CompanyEmpWage> companyEmpWageList;
	
	public WageComputation() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}
	
	public void addCompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRate, noOfWorkingDays, hrsPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			
			companyEmpWage.setTotal_EmpWage(this.computeEmpWage(companyEmpWage)); 
			System.out.println(companyEmpWage);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int total_emp_hrs = 0;
		int total_working_days = 0;
		while(total_emp_hrs < companyEmpWage.hrsPerMonth 
				&& total_working_days < companyEmpWage.noOfWorkingDays) {
			
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
						
			}
			total_emp_hrs += emp_hrs;
			System.out.println("Days : "+total_working_days+" Emp Hr : "+ emp_hrs);
			}
		return total_emp_hrs * companyEmpWage.empRate;
	}
	
	
	public static void main(String[] args) {
		WageComputation empWageBuilder = new WageComputation();
		empWageBuilder.addCompanyEmpWage("D-Mart",20,30,100);
		empWageBuilder.addCompanyEmpWage("Reliance",25,27,95);
		empWageBuilder.computeEmpWage();
		}
}
