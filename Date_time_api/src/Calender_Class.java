import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender_Class {
    public static void main(String[] args) {
        System.out.println(new Date());
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // not index
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        System.out.println(calendar.get(Calendar.AM_PM));


    }
}
