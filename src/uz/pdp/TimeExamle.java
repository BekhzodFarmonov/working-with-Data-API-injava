package uz.pdp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimeExamle {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // LocalTime example
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // LocalDateTime example
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Formatting example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'DATE:'yyyy-MM-dd 'TIME:'HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
