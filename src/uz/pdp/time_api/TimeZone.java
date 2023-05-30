package uz.pdp.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;

public class TimeZone  {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        LocalDate localDateTime= LocalDate.now();
        System.out.println(localDateTime);
        Month month=localDateTime.getMonth();
        System.out.println("month = " + month);
        System.out.println(month.maxLength());
    }
}
