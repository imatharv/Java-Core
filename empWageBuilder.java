public class empWageBuilder {

	public static final int empWagePerHour=20;
	public static final int workingHours=20;
	public static final int isPartTime=1;
	public static final int isFullTime=2;

	public static void main(String[] args) {

		int empHours = 0;
		int empWage = 0;

		for(int day=1;day<=workingHours;day++)
		{
			int empCheck=((int)Math.floor(Math.random()*10))%3;

			switch(empCheck)
			{
				case isFullTime:
						empHours = 8;
						System.out.println("Employee is present full-time on day " + day);
						break;
				case isPartTime:
						empHours = 4;
						System.out.println("Employee is present part-time on day " + day);
						break;
				default:
						empHours = 0;
						System.out.println("Employee is abscent on day " + day);
			}
			empWage += empHours*empWagePerHour;
			// System.out.println("Employee's wage on day " + day + " is: " + empWage);
		}
		System.out.println("Employee's wage per month: " + empWage);
	}
}
