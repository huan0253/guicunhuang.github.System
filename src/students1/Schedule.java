
package students1;

/**
This is the Schedule Superclass class that keeps a track of the aircraft mentenance scheduled activities.
Review this code carefully and fill required loopholes.
*/
public abstract class Schedule
{
private String description;


/**
   Constructs an schedule without a description.
*/
public Schedule() {}

public Schedule(String description) {
	this.description= description;
}

/**
   Sets the description of this schedule.
   @param description the text description of the schedule
*/
public void setDescription(String description)
{
   this.description = description;
}


/**
   Determines if this scheduled activity happens on the given date.
   @param year the year
   @param month the month
   @param day the day
   @return true if the scheduled activity happens on the given date.
*/

/**
TO DO: Include the abstract method  DueOn() here.
@return the value of instance variable discription
*/

public String getDescription() {
	return description;
}
 public abstract boolean dueOn (int year, int month, int day);
/**
   Converts scheduled activity to string description.
*/
public String toString()
{
   return description;
}
}