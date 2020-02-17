package Oracle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class O115Date {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of (2014,07,31,1,1);
        dt.plusDays (30).plusMonths (1);
       // System.out.print (dt.format (DateTimeFormatter.ISO_DATE));
        System.out.println (dt.format (DateTimeFormatter.ISO_DATE_TIME));
    }
}
