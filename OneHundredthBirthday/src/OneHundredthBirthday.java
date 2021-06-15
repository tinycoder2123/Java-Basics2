/*****************************************************************
* Module 1
 * Project 2
 * Program One Hundredth Birthday
 * By Karolina Szulczyk
 * 
 *****************************************************************/


import java.util.Scanner;

public class OneHundredthBirthday 
{

	public static void main(String[] args) 
	{
	// Request user month of birth
			Scanner scan = new Scanner (System.in);
			System.out.print("Enter the month you were born: ");
			String month = scan.nextLine();
			
			// Request user day of birth
			Scanner scan1 = new Scanner (System.in);
			System.out.print("Enter the day you were born: ");
			int day = scan1.nextInt();

			// Request user year of birth
			Scanner scan2 = new Scanner (System.in);
			System.out.print("Enter the year you were born: ");
			int year = scan2.nextInt();
			
			// Year you will be 100
			System.out.print("You will be 100 on " +  month + " " + day + "," + (year += 100));
	}// End main

}// End Program
