package employeeWage;

public class EmployeeWage {

	public static final int  IS_FULL_TIME=1;
	
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Computation");
		
		int empCheck=(int)(Math.floor(Math.random()*10)%2);
		if(empCheck==IS_FULL_TIME) {
			System.out.println("Employee is present");
		}
		else {
			
			System.out.println("Employee is absent");
		}

	}

}
