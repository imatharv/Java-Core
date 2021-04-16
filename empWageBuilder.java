public class empWageBuilder {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;

	public empWageBuilder(String companyName, int empWagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;
	}

	public int calculateWage() {
		int empHours = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;

		while (totalWorkingHours <= workingHours && totalWorkingDays <= workingDays) {
			totalWorkingDays++;

			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
			case isFullTime:
				empHours = 8;
				// System.out.println("Employee is present full-time on day " +
				// totalWorkingDays);
				break;
			case isPartTime:
				empHours = 4;
				// System.out.println("Employee is present part-time on day " +
				// totalWorkingDays);
				break;
			default:
				empHours = 0;
				// System.out.println("Employee is abscent on day " + totalWorkingDays);
			}
			totalWorkingHours += empHours;
			System.out.println("Day: " + totalWorkingDays + "& Working hours: " + empHours);
		}
		return totalWorkingHours * empWagePerHour;
	}

	public static void main(String[] args) {
		empWageBuilder dmart = new empWageBuilder("Dmart", 10, 2, 10);
		empWageBuilder walmart = new empWageBuilder("Walmart", 20, 4, 10);

		System.out.println("Total employee's wage of Company: " + dmart.companyName + ": " + dmart.calculateWage());
		System.out.println("Total employee's wage of Company: " + walmart.companyName + ": " + walmart.calculateWage());
	}
}
