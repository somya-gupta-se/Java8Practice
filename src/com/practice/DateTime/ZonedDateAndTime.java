package com.practice.DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZonedDateAndTime {

	public static void main(String[] args) {
		/*
		 * for(String zoneId : ZoneId.getAvailableZoneIds()) {
		 * System.out.println(zoneId); ZoneId zoneid1 = ZoneId.of(zoneId); String
		 * zoneid2 = zoneid1.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		 * System.out.println(zoneid1+" "+zoneid2); }
		 */
		
		ZoneId zoneid3 = ZoneId.of("Asia/Ho_Chi_Minh");
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneid3);  

		System.out.println(ldt);
		System.out.println(zdt);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		System.out.println(zdt2);
		System.out.println(zdt2.getZone());
	}

}
