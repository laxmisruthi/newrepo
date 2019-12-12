import java.util.Scanner;

public class DaysToYear {

	public static void main(String[] args) {
		int day;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of days");
		day = s.nextInt();
		int year = 0, days, month;
		if (day > 365) {
			year = day / 365;
			days = day % 365;
			System.out.println(year + " years  " + days + " days");

		}
	}

}
