package students1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
/**
 * @author guicun Huang
 * this class put scheduled activities into an array
 * use for loop to check if the date entered by user is the same as the scheduled date
 */

public class ScheduleAllTest {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
/**
 * create and fill an array of Schedule objects
 *  this array includes three types of schedules
 *  everyday schedule; once a month schedule; once a year schedule
*/
	
	Schedule[] schedule = new Schedule[5];
	
	schedule[0]	= new PerDaySchedule("change the oil");
	schedule[1]= new OnceSchedule("change the wheel",2020,6,2);
	schedule[2]= new PerMonthSchedule("monthly check",20);
	schedule[3]= new OnceSchedule("yearly check",2020,8,22);
	schedule[4]= new PerDaySchedule("sanitizing");
	System.out.println(schedule[2].getDescription());
	
/** 
 * prompt user to input date 
 */
	  String shouldContinue="y" ;
 while(shouldContinue.equalsIgnoreCase("y")) {
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("enter the date(like 2020 01 30)");
	String date = scanner.nextLine();
/**
 * get the String of day, month and year using Substring
 */
	String sYear = date.substring(0,4);
	String sMonth = date.substring(5,7);
	String sDay = date.substring(8,10);
	
	/**
	 * convert the String of day, month and year to int type
	 * 2020 01 30
	 */	
	int year = Integer.parseInt(sYear);
	int month = Integer.parseInt(sMonth);
	int day = Integer.parseInt(sDay);
	
    System.out.println("Here are your scheduled activities on " + year +"/"+month +"/" +day);
    /**
	 * loop throuth the schedule array and find out the activities that meet the requirement
	 * 2020 01 30
	 */	
    for (int i=0; i<schedule.length;i++) {
		if(schedule[i].dueOn(year,month, day) )			
			System.out.println(schedule[i].toString());
    }
    System.out.println("continue/y; quit/n?") ;
    Scanner keyboard = new Scanner(System.in);
    shouldContinue = keyboard.next();
  }
 }
}
