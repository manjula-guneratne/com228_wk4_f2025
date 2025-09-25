package com.mg.week4.ex1;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time time = new Time();
		
		displayTime("After time object is created", time);
		System.out.println();
		
		try
		{
			time.setTime(99, 99, 99);
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		displayTime("After calling setTime with invalid values", time);
	}

	private static void displayTime(String header, Time t) {
		// TODO Auto-generated method stub
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
		
	}

}
