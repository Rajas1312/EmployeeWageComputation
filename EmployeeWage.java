package employeeWage;

public class EmployeeWage {

	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Computation");
		int empHrs=0;
		int empWage=0;
		
		int empCheck=(int)(Math.floor(Math.random()*10)%3);
		if(empCheck==IS_FULL_TIME) {
			empHrs=8;
			empWage=empHrs*EMP_RATE_PER_HOUR;
		}
		else if(empCheck==IS_PART_TIME) {
			empHrs=4;
			empWage=empHrs*EMP_RATE_PER_HOUR;
		}
		else {
			empHrs=0;
		}
		System.out.println("Employee wage is "+empWage);

	}

}
