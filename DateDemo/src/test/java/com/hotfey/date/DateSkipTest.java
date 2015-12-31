package com.hotfey.date;

import java.text.ParseException;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class DateSkipTest {
	@Ignore
	@Test
	public void dateParseTest() throws ParseException {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		String source = "2015-12-12 12:12:12";
		System.out.println(DateConvert.dateParse(pattern, source));
	}

	@Ignore
	@Test
	public void dateFormatTest() {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		Date date = new Date();
		System.out.println(DateConvert.dateFormat(pattern, date));
	}
}
