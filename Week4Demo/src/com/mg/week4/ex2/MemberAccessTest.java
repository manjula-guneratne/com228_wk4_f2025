package com.mg.week4.ex2;

public class MemberAccessTest {
	
	public static void main(String[] args) {
		Time1 time = new Time1();
		
		time.hour = 7;
		time.minute = 15;
		time.second = 30;
		
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());
	}	

}
