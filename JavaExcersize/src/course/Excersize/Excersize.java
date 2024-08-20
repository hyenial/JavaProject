package course.Excersize;

public class Excersize {
	public static void main (String[] args) {
		System.out.println(isLeapYear(2048));
	}

	private static boolean isLeapYear(int year) {
		
		boolean step_1 = (year % 4) ==0;
		boolean step_2 =(year %100) != 100;
		boolean step_3 = (year%400) == 400;
		
		return step_1 && (step_2 || step_3);
		
	}
	


}
