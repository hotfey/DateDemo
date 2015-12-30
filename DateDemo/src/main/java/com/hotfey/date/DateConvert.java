package com.hotfey.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {
	/**
	 * Parses text from the beginning of the given string to produce a date. The
	 * method may not use the entire text of the given string.
	 * 
	 * @param pattern
	 *            - the pattern describing the date and time format
	 * @param source
	 *            - A String whose beginning should be parsed.
	 * @return
	 * @throws ParseException
	 */
	public static Date dateParse(String pattern, String source) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.parse(source);
	}

	/**
	 * Parses text from the beginning of the given string to produce a date. The
	 * method may not use the entire text of the given string.
	 * 
	 * @param pattern
	 *            - the pattern describing the date and time format
	 * @param date
	 *            - the time value to be formatted into a time string.
	 * @return
	 */
	public static String dateFormat(String pattern, Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(date);
	}
}
