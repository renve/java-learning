package com.syntax.class01;

import java.time.Month;
import java.util.Scanner;

public class ClassOne {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);

		//case statement
		String month = "December";
		
		switch(month)
		{
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;
		}
		
	    
	}

}
