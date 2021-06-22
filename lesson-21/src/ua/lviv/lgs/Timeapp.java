package ua.lviv.lgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Timeapp {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		System.out.println(dateLocaldateTime(date));
		System.out.println(dateLocalDate(date));
		System.out.println(dateLocalTime(date));

	}

	public static LocalDate dateLocalDate(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

		return zdt.toLocalDate();
	}

	public static LocalTime dateLocalTime(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

		return zdt.toLocalTime();
	}

	public static LocalDateTime dateLocaldateTime(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

		return zdt.toLocalDateTime();
	}
}
