package com.cubic.patient.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public boolean checkSsn(final String ssn) {
		Pattern ssn_regex = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher = ssn_regex.matcher(ssn);
		return matcher.matches();
	}
	
	public boolean checkEmail(final String email){
		Pattern email_regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher = email_regex.matcher(email);
		return matcher.matches();
	}

	public Date getCurrentDate() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy hh:mm:ssa z");
		TimeZone time = TimeZone.getTimeZone("GMT");
		format.setTimeZone(time);
		return date;
	}

	public Date getPastDate() {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, -100);
		Date date = now.getTime();
		return date;
	}

	public Date stringToDate(final String dob) {
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		Date date = null;
		try {
			date = format.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public String dateToString(final Date date) {
		DateFormat df = new SimpleDateFormat("M-dd-yyyy");
		String dob = df.format(date);
		return dob;
	}
}
