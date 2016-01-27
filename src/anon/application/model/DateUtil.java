package anon.application.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {
	private static final String DATE_PATTERN =  "dd.MM.yyyy";
	private static final DateTimeFormatter DATE_FORMATTER = 
			DateTimeFormatter.ofPattern(DATE_PATTERN);

	public static String format(LocalDate date)	{
		if (date == null)	{
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	public static LocalDate parse(String date)	{
		try	{
			return DATE_FORMATTER.parse(date, LocalDate::from);
		} catch(DateTimeParseException e)	{
			e.printStackTrace();
			return null;
		}
	}

	public static boolean validDate(String date)	{
		return DateUtil.parse(date) != null;
	}

























}
