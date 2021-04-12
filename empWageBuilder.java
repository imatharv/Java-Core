public class empWageBuilder {
	public static void main(String[] args) {
		//use-case-1
		int isFullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is abscent");
	}
}
