import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
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

        boolean before = hiringdate.isBefore(today);
        System.out.println(before);
        boolean after  = hiringdate.isAfter(today);
        System.out.println(after);

        LocalDateTime atStartDay = today.atTime(9,15);
        LocalDateTime atStartDay2 = today.atStartOfDay();
        System.out.println(atStartDay2);
        LocalDate with = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        today.minusDays(10);
        today.minusMonths(3);
        today.minusYears(3);

//        today.minusYears(12 , ChronoUnit.MONTHS);
        today.minus(Period.ofDays(23));





    }
}
