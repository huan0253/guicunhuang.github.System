package students1;
/**
 * 
 * @author guicun Huang
 * use reflection to check PerDayScheduleis just a subclass of Schedule
 *
 */
 import java.lang.reflect.*;
 
public class ScheduleDriver {

	public static void main(String[] args) {
		Class perDay = PerDaySchedule.class;
		Class schedule = Schedule.class;
		/**
		 * check if the PerDaySchedule is a subclass of Schedule and if PerDaySchedule class has no extra fields
		 */
		
		System.out.println("PerDayScheduleis just a subclass of Schedule:"+ (perDay.getSuperclass().equals(schedule)));
		System.out.println("expected:"+ (perDay.getSuperclass().equals(schedule)));
		
		System.out.println("PerDaySchedule class has no extra fields: " + (perDay.getDeclaredFields().length==0));
		System.out.println("expected:"+ (perDay.getSuperclass().equals(schedule)));
		
		System.out.println("Looking at perday schedules: change the gear oil for the aircraft");
		PerDaySchedule perDay2 = new PerDaySchedule("change the gear oil for the aircraft");
		System.out.println("expected:" + perDay2.toString());
		System.out.println(perDay2.dueOn(2010, 1, 11));
		System.out.println("expected:" + perDay2.dueOn(2010, 1, 11));
  }
	
	   
}

