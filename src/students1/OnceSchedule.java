package students1;

/**
 * @author guicui
 * @param month the month of the  date that has scheduled activity
   @param day the day of the date that has scheduled activity
 */
public class OnceSchedule extends Schedule {
	private int day;
	private int month;
	private int year;
    /**
     * declare a constructor with no parameters
     */
	 public OnceSchedule() {
		 super();
	 }
	 /**
	  * declare a constructor with a parameter
	  */
   public OnceSchedule(String description,int year, int month, int day) {
	 super(description) ;
	 this.day = day;
	 this.month = month;
	 this.year= year;
}
	/**
	 * override dueOn() method to make sure the scheduled activity happened once a month
	 */
   public  boolean dueOn (int year, int month, int day)
	{
		return((this.day==day)&&(this.month==month)&&(this.year==year)) ;
		
	}
}
