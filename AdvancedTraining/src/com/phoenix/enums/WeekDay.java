package com.phoenix.enums;

public enum WeekDay {

	SUNDAY, MONDAY(20, "Mon"), TUESDAY, WEDNESDAY, THURSDAY(30, "Thur"), FRIDAY(31), SATURDAY;

	private int dayNo;
	private String shortName;
	
	private WeekDay() {
		dayNo = -1;		
		System.out.println("No-Arg Constructor of enum Weekday");
	}

	WeekDay(int dayNo) {
		this.dayNo = dayNo;
		System.out.println("Single Parameterized Constructor of enum Weekday");
	}
	
	WeekDay(int dayNo, String sNm){
		this.dayNo = dayNo;
		this.shortName = sNm;
		System.out.println("Two Parameterized Constructor of enum Weekday");
	}
	
	public int getDayNo() {
		return dayNo;
	}
	
	public String getShortName() {
		return shortName;
	}
	
}
