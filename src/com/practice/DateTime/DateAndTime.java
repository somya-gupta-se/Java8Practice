package com.practice.DateTime;
import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate ld1 =  LocalDate.now();
		LocalDate ld2 = LocalDate.of(2022, 12, 12);
		System.out.println(ld1);
		System.out.println(ld2);
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(12, 12);
		System.out.println(lt1);
		System.out.println(lt2);
		
		LocalDateTime ldt1 =LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(ld1, lt1);
		System.out.println(ldt1);
		System.out.println(ldt2);
		
		MonthDay md = MonthDay.of(12, 1);
		System.out.println(md);
		
	}

}
