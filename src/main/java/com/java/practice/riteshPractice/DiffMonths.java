package com.java.practice.riteshPractice;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;

public class DiffMonths {

	public static void main(String[] args) {
		OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
		Date date = Date.from(utc.toInstant());
		getMonthsDiff(date,date);
	}
	
	static void getMonthsDiff(Date from, Date to) {
		Period diff = Period.between(
	            LocalDate.parse("2016-08-31").withDayOfMonth(1),
	            LocalDate.parse("2016-10-12").withDayOfMonth(1));
	System.out.println(diff.getMonths());
	
	}

}
