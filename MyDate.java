import java.util.Scanner;

/************************************************************************************************************
Purpose:  This class will model a simple date by keeping day, month and year information.   Leap years are NOT
               accommodated in this class.
Author:  Linda Crane and Jamie Harnum
Course: F2018 - CST8130
Lab Section: 313
Data members:  day : int - value between 1 and 31 inclusive (depending on value in month)
               month: int - value between 1 and 12 inclusive
               year: int - positive value
Methods: default constructor - sets date to Jan 1, 2018
         toString (): String - prints date in year/moht/day format
         inputDate(Scanner): boolean - reads a valid date from the Scanner parameter and returns through
                                       boolean success or not
         addOne(): void - adds one to the day field and then adjusts month and year as needed. 
         isEqual(MyDate): checks if the date is equal to a specified date
         isGreaterThan(MyDate): checks if the day is greater than a specified date                                             
         

*************************************************************************************************************/

public class MyDate {

	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		//if no date is set, this date is the default
		year = 2018;
		month = 1;
		day = 1;
		
	}
	
	public boolean inputDate(Scanner in) { //taken directly from Lab1
		month = 0;
		day = 0; 
		year = 0;
		
		do {
				
			System.out.print ("Enter month - between 1 and 12: \n");
			if (in.hasNextInt())
				this.month = in.nextInt();
			else {
				System.out.println ("Invalid month input");
				in.next();
			}
		} while (this.month <= 0 || this.month > 12);
		
		do {
			
			System.out.print ("Enter day - between 1 and 31: \n");
			if (in.hasNextInt())
				this.day = in.nextInt();
			else {
				System.out.println ("Invalid day input");
				in.next();
			}
		} while (this.day <= 0 || this.day > 31 || (this.month == 2 && this.day > 29) || (this.day > 30 && (this.month == 9 ||this.month == 4 ||this.month == 6 ||this.month == 11) ) ); 
		
		do {
			System.out.print ("Enter year: \n");
			if (in.hasNextInt())
				this.year = in.nextInt();
			else {
				System.out.println ("Invalid day input");
				in.next();
			}
		} while (this.year <= 0);
			
		return true;		
	}
	
	
	public String toString() {
		return "Date: " + this.month + "/" + this.day + "/" + this.year;
	}
	
	public void addOne() {
		//add an extra day & handle change in month/year as needed
	}
	
	public boolean isEqual(MyDate dueDate) {
		//compare two dates to see if they are equal
		return true;
	}
	
	public boolean isGreaterThan(MyDate dueDate) {
		//if today > dueDate, return true
		return true;
	}
}
