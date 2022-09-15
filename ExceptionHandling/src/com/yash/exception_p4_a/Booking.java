package com.yash.exception_p4_a;

import java.time.LocalTime;
import java.util.Scanner;

public class Booking {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) throws BookingLimitExceedException, TimeExceededException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of traveller:");
		int n = sc.nextInt();
		Booking booking=new Booking ();
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the name:");
			booking.setName(sc.next());
			System.out.println("Enter the age:");
			booking.setAge(sc.nextInt());
		}
		System.out.println("Enter the mode of Booking:1.Tatkal  2.Regular");
		int mode=sc.nextInt();
		if(mode==1)
		{
			if(LocalTime.now().getHour()>10 &&LocalTime.now().getHour()<12)
			{
				if(n<=4)
				{
					System.out.println("Ticket Booked");
				}
				else {
					throw new BookingLimitExceedException("BOOKING LIMIT EXCEEDED");
				}
			}
			else {
				throw new TimeExceededException("TIME EXCEEDED");
			}
			
		}
		
		System.out.println("END OF MAIN");
		System.exit(0);
		
		
	}
}
