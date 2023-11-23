import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now= LocalTime.now();
        System.out.println("now" + now);

        LocalTime workStart = LocalTime.parse("08:00");
        System.out.println("work Start: "  + workStart);

        LocalTime workEnd = LocalTime.of(16, 00);
        System.out.println("work End: "+ workEnd );

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.get(ChronoField.AMPM_OF_DAY));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);

        System.out.println("work Start " + workEnd.until(workEnd, ChronoUnit.HOURS));
        System.out.println("Working hours "+ ChronoUnit.HOURS.between(workStart , workEnd));
        System.out.println("working hours" + Duration.between(workStart,workEnd));

        now.plus(1 , ChronoUnit.HOURS);
        now.plusHours(1);
        now.plusMinutes(3);

        boolean isBefore = LocalTime.parse("03:32").isBefore(LocalTime.parse("03:53"));
        System.out.println(isBefore);
        System.out.println(now.truncatedTo(ChronoUnit.HOURS));

    }
}
