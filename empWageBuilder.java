public class empWageBuilder {
	public static void main(String[] args) {

		int isPartTime = 1;
   		int isFullTime = 2;

		int empRatePerHour = 20;

		int empHours = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck){
			case isFullTime:
					empHours = 8;
					System.out.println("Employee is present full-time");
					break;
			case isPartTime:
					empHours = 4;
					System.out.println("Employee is present part-time");
					break;
			default:
					empHours = 0;
					System.out.println("Employee is abscent");
			}

			empWage = empHours * empWagePerHour;
			System.out.println("Employee's Wage: " + empWage);
		}
	}
}
