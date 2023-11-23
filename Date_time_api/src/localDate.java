import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Date;

public class localDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate hiringdate = LocalDate.of(2017 , Month.APRIL , 30);
        System.out.println("Hiring date" + hiringdate);

        LocalDate futureDate = LocalDate.parse("2017-12-17");
        System.out.println("future Date: " + futureDate);

        System.out.println(today.getYear());
        System.out.println(today.lengthOfYear());
        System.out.println(today.get(ChronoField.YEAR));

        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.lengthOfMonth());
        System.out.println(today.lengthOfMonth());
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(today.getDayOfWeek());
        System.out.println(today.get(ChronoField.DAY_OF_WEEK));
        System.out.println(today.isLeapYear());


    }
}
