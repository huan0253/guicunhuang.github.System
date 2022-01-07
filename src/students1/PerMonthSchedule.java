package students1;

/**
This is code for Part 2. Create a subclass named PerMonthSchedule.
This is a schedule of activities that happen on the same day every month.
*/

public class PerMonthSchedule extends Schedule {
    
	private int day; //  a day scheduled once a month schedule
    /**
	 * inherit a no-parameter constructor
	 */
    public PerMonthSchedule() {
    	super();
//	   setDescription(description);
	}
    
    /**
	 * inherit a one-parameter constructor
	 */
	public PerMonthSchedule(String description,int day) {
		super(description);
		this.day = day;
	}
	/***
	 * override DueOn() method to make sure the scheduled activity happened once a month
	 */
	public  boolean dueOn (int year, int month, int day)
	{
		return (this.day==day) ;
			
	}
}
