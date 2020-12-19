package employeeWage;

public class EmployeeWage {

	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	
	public static void main(String[] args) {
		computeEmpWage("Dmart",20,10,10);
		computeEmpWage("Relaince",20,20,10);
		
	}
	public static int computeEmpWage(String company,int empRatePerHrs,int noOfWorkingDays,int maxHrsPerMonths) {
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
