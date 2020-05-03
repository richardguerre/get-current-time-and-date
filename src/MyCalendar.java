import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar {

	public static void main(String[] args) {
		 getCurrentTime();
	}
	
	public static void getCurrentTime(){
		Calendar cal = Calendar.getInstance();
	      int year = cal.get(Calendar.YEAR);
	      int month = cal.get(Calendar.MONTH)+1;
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	      int hour = cal.get(Calendar.HOUR_OF_DAY);
	      int minute = cal.get(Calendar.MINUTE);
	      int second = cal.get(Calendar.SECOND);
	      int millisecond = cal.get(Calendar.MILLISECOND);
	      
	      System.out.printf("My calendar time: %4d-%02d-%02d,%02d:%02d:%02d:%03d\n", year, month, day, hour, minute, second, millisecond);
	}
}