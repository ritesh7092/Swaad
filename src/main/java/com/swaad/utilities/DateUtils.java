package com.swaad.utilities;

import java.time.LocalDate;

public class DateUtils {
	
	public static LocalDate getDateBeforeDays(int days) {
	    return LocalDate.now().minusDays(days);
	}

}
