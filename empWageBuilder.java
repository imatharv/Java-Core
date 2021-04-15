public class empWageBuilder {
	public static final int empWagePerHour = 20;
	public static final int workingHours = 100;
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int workingDays = 20;

	public static void calculateWage() {
		int empHours = 0;
		int empWage = 0;
		int totalWorkingDays = 0;

		while (empHours <= workingHours && totalWorkingDays <= workingDays) {
			totalWorkingDays++;

			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
			case isFullTime:
				empHours = 8;
				System.out.println("Employee is present full-time on day " + totalWorkingDays);
				break;
			case isPartTime:
				empHours = 4;
				System.out.println("Employee is present part-time on day " + totalWorkingDays);
				break;
			default:
				empHours = 0;
				System.out.println("Employee is abscent on day " + totalWorkingDays);
			}
			empWage += empHours * empWagePerHour;
			empHours += empHours;
		}
		System.out.println("Employee's wage for maximum of 100 hours or 20 days: " + empWage);
	}

	public static void main(String[] args) {
		calculateWage(); // Directly calling function without creating obj 'cause its a static one.
	}
}
