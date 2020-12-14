package employeeWage;

public class EmployeeWage {

	public static final int  IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Computation");
		int empHrs=0;
		int empWage=0;
		
		int empCheck=(int)(Math.floor(Math.random()*10)%2);
		if(empCheck==IS_FULL_TIME) {
			empHrs=8;
			empWage=empHrs*EMP_RATE_PER_HOUR;
		}
		System.out.println("Employee wage is "+empWage);

	}

}
