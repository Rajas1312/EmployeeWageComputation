package employeeWage;

public class EmployeeWage {

	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUMBER_OF_DAYS=20;
	public static final int MAX_HRS_IN_MONTHS=100;
	
	public static void main(String[] args) {
		computeEmpWage();
	}
	public static int computeEmpWage() {
		System.out.println("Welcome to EmployeeWage Computation");
		int empHrs=0;
		int empWage=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		
		while( totalEmpHrs<=MAX_HRS_IN_MONTHS && totalWorkingDays<NUMBER_OF_DAYS) {
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
	 empWage=empHrs*EMP_RATE_PER_HOUR;
	 totalEmpWage+=empWage;
	 System.out.println("Employe Wage is " + empWage);
	 
		}
	System.out.println("Total wage is " +totalEmpWage);
	return totalEmpWage;
		
	}

}
