import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time_ape2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        System.out.println(simpleDateFormat.format(today));

        System.out.println(today.getDate());
        System.out.println(today.getYear()); //year starts from 1900
        System.out.println(today.getDate());
        System.out.println(today.getMonth()); // zero based index of the month
        System.out.println(today.getTime()); // number of miliseconds from 1970 till now
        Date date = simpleDateFormat.parse("29/12/1979"); // converts string to date
        System.out.println(date);
    }
}
