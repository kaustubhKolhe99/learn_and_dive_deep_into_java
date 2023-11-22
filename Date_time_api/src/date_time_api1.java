import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time_api1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("EEEE dd/MM/yyyy hh:mm:ss.SS Z");
        Date today = new Date();
        System.out.println(simpleDateFormat.format(today));



    }
}
