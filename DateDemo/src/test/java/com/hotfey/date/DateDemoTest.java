package com.hotfey.date;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

public class DateDemoTest {
	@Test
	public void nextDayTest() throws ParseException {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		String source = "2015-12-29 00:00:00";
		Date date = DateDemo.dateParse(pattern, source);
		System.out.println(date);
		System.out.println(DateDemo.nextDay());
		System.out.println(date.before(DateDemo.nextDay()));
	}
}
