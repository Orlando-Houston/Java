package Oracle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class O3StringLocalDate {
    public static void main(String[] args) {

       // String  date= LocalDate.parse ("2014-05-04",DateTimeFormatter.ISO_DATE);
       // LocalDate date= LocalDate.parse ("2014-05-04",DateTimeFormatter.ISO_DATE);
       // String date1= LocalDate.parse ("2014-05-04").format (DateTimeFormatter.ISO_DATE_TIME);



       // System.out.println (date1);
        LocalDateTime myDateObj=LocalDateTime.now ();
        System.out.println ("Before formatting"+": "+myDateObj);

        DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern ("dd-MM-yyy  HH:mm:ss");


        String formattedDate=myDateObj.format (myFormatObj);
        System.out.println ("after formatting:"+" "+ formattedDate);
    }
}
