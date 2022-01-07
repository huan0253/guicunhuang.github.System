package students1;

/**
This is code for Part 1.
In this file, create a subclass named PerDaySchedule. This is 
a subclass of the Schedule Superclass.
Schedule has a description (for example,
"change the gear oil") and happens on one or more dates.
A perdayschedule activity happens every day.
*/


public class PerDaySchedule extends Schedule
{  	
	/**
	 * inherit a no-parameter constructor
	 */
	public PerDaySchedule() {
		super() ;

	}
	/**
	 * inherit a one-parameter constructor
	 */
	public PerDaySchedule(String description) {
		super(description);
	}
	
	/***
	 * override DueOn() method to make sure the scheduled activity happened every day
	 */
	public  boolean dueOn (int year, int month, int day) {
		return  true;
	}
	
}
