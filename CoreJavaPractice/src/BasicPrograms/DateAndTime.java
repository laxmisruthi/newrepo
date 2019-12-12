package BasicPrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.joda.time.DateTime;

public class DateAndTime {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);

		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		System.out.println("joda datetime");
		DateTime now = new DateTime();
		System.out.println("Current Day: " + now.dayOfWeek().getAsText());
		System.out.println("Current Month: " + now.monthOfYear().getAsText());
		System.out.println("Current Year: " + now.year().getAsText());
		System.out.println("Current Year is Leap Year: " + now.year().isLeap());

		System.out.println(now);
	}

}
