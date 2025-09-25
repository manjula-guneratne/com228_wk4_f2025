package com.mg.week4.ex3;

public class Time2 {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time2(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time2(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	public Time2(int hour) {
		super();
		this.hour = hour;
	}

	
	public Time2() {
		this(0,0,0);
	}

}
