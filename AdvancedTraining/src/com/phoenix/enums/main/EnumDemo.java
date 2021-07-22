package com.phoenix.enums.main;

import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		
		System.out.println(Color.BLUE);
		System.out.println("Ordinal : " + Color.BLUE.ordinal());
		
		Color favouriteColor = Color.RED;
		System.out.println("Favourite Color : " + favouriteColor);
		System.out.println("Favourite Color Ordinal : " + favouriteColor.ordinal());

		System.out.println();
		
		for(Color color: Color.values())
			System.out.println(color);
		
		System.out.println();
		
		System.out.println(WeekDay.THURSDAY);
		System.out.println("Ordinal : " + WeekDay.THURSDAY.ordinal());
		System.out.println("Day No : " + WeekDay.THURSDAY.getDayNo());
		System.out.println("Short Name : " + WeekDay.THURSDAY.getShortName());
		
		System.out.println();
		
		WeekDay today = WeekDay.TUESDAY;
		System.out.println(today);
		System.out.println("Today Ordinal : " + today.ordinal());
		
		System.out.println();
		
		for(WeekDay day: WeekDay.values())
			System.out.println(day + "\t Ordinal : " + day.ordinal());
		
		System.out.println();
		
		// Switch - Case
		WeekDay whichDay = WeekDay.SUNDAY;
		switch (whichDay) {
		case MONDAY:
			System.out.println("Go to Office");
			break;
		case TUESDAY:
			System.out.println("Meeting with team");
			break;
		case SATURDAY:
			System.out.println("Weekend");
			break;
		case SUNDAY:
			System.out.println("Rest");
			break;
		default:
			System.out.println("Sorry! Wrong Choice!!");
			break;
		}
	
	}

}
