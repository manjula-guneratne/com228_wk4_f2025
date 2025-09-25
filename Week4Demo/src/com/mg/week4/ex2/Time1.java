package com.mg.week4.ex2;

public class Time1 {

//	@Override
//	public String toString() {
//		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour ==12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
//	}

	int hour;
	int minute;
	int second;
	
	public void setTime(int hour, int minute, int second) {
		//validate hour, min & sec
		if (hour < 0 || hour >=24 || minute < 0 || minute >=60 || second <0 || second >=60)
		{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else
			throw new IllegalArgumentException(
					"hour, minute and/or second was out of range");
	}
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
	}
}
