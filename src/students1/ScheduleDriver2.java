package students1;

import java.lang.reflect.Field;

/**
 * @author guicun Huang
 * check if PerDaySchedule class has no extra fields by counting the number of variables
 * check if the date is scheduled or not by using DueOn method
 */
public class ScheduleDriver2 {

	public static void main(String[] args) {
		
		Class perMonth = PerMonthSchedule.class;
		Class schedule = Schedule.class;
		Class once = OnceSchedule.class;
		/**
		 * check if the PerDaySchedule and OnceSchedule are  subclasses of Schedule and if they has any extra fields
		 */
		System.out.println("perMonthSchedule is a subclass of Schedule:"+ schedule.equals(perMonth.getSuperclass()));		
		System.out.println("Expected: true " );
		
		
		System.out.println("onceSchedule is a subclass of Schedule:"+ schedule.equals(once.getSuperclass()));		
		System.out.println("Expected: true " );
		
		System.out.println("PerMonthSchedule class has no extra fields:" + (perMonth.getDeclaredFields().length ==0));
		System.out.println("Expected:"+(perMonth.getDeclaredFields().length ==0));
		
		System.out.println("OnceSchedule class has no extra fields:" + (once.getDeclaredFields().length ==0));
		System.out.println("Expected: "+(perMonth.getDeclaredFields().length ==0));
		
		PerMonthSchedule perMonth2 = new PerMonthSchedule("monthly check",11);
		System.out.println(perMonth2.dueOn(2010,2,11));
		System.out.println("expected:" + perMonth2.dueOn(2010, 2, 11));
		System.out.println(perMonth2.dueOn(2010, 3, 22));
		System.out.println("expected:" + perMonth2.dueOn(2010,3,22));
		
		OnceSchedule once3 = new OnceSchedule("yearly check",2010,8,20);
		System.out.println(once3.dueOn(2010, 8, 20));
		System.out.println("expected:" + once3.dueOn(2010, 8, 20));
		System.out.println(once3.dueOn(2010, 3,31));
		System.out.println("expected:" + once3.dueOn(2010, 8, 20));
		}
		}
	
