package date;

import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("Current date is " + d1);
		Date d2 = new Date(1L);
		System.out.println("Date represented is " + d2);
	}
}