package employeeWage;
public class EmployeeWage {
	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	
	public final String company;
	public final int empRatePerHrs;
	public final int noOfWorkingDays;
	public final int maxHrsPerMonths;
	public int totalEmpWage;
	
	public EmployeeWage(String company,int empRatePerHrs,int noOfWorkingDays,int maxHrsPerMonths) {
		this.company=company;
		this.empRatePerHrs=empRatePerHrs;
		this.noOfWorkingDays=noOfWorkingDays;
		this.maxHrsPerMonths=maxHrsPerMonths;
	}
	
	public static void main(String[] args) {
	
		EmployeeWage Dmart=new EmployeeWage("Dmart",20,2,10);
		EmployeeWage Reliance=new EmployeeWage("Relaince",10,4,20);
		Dmart.computeEmpWage();
		Reliance.computeEmpWage();
	
	
	}
	
	public int computeEmpWage() {
		System.out.println("Welcome to EmployeeWage Computation");
		int empHrs=0;
		int empWage=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		
		while( totalEmpHrs<=maxHrsPerMonths && totalWorkingDays<noOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch(empCheck) {
		case IS_FULL_TIME:
			empHrs=8;
			break;
		case IS_PART_TIME:
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
	 empWage=empHrs*empRatePerHrs;
	 totalEmpWage+=empWage;
	 System.out.println("Employe Wage is " + empWage);
		}
	System.out.println("Total wage for " +company + " is " +totalEmpWage);
	return totalEmpWage;
		
	}

}
