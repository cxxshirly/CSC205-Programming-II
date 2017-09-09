// a client program that contains a main method that used to test out the Clock class
// Wriiten by : <Xinxin Chen>

import java.util.*;

public class TestClock {

	public static void main (String[] args) {

		// object of scanner call input takes user's input		
		Scanner input = new Scanner(System.in);
		Clock dvr = new Clock();
		
		// takes hours,minutes,and seconds from user's input
		System.out.println("What time would you like to set your DVR to?");
		System.out.println();
		System.out.print("Hours = ");
		int hour = input.nextInt();
		System.out.print("Minutes = ");
		int minute = input.nextInt();
		System.out.print("Seconds = ");
		int second = input.nextInt();
	
		// set dvr's clock to values specified by user's input	
		// and print out
		dvr.reset(hour,minute,second);
		System.out.println();
		System.out.println("The time is now " + dvr.toString());
		System.out.println();
		System.out.println("Advancing the time!");
		System.out.println();
		
		// advances the clock by one second, and print out
		dvr.advance();
		System.out.println("The time is now " + dvr.toString());

	}	

} 
