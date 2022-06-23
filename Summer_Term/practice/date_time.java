package practice;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class date_time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime date_time = LocalDateTime.now();
        java.time.format.DateTimeFormatter format_date_time = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("\n"+date+"\n");
        System.out.println(time+"\n");
        System.out.println(date_time+"\n");
        System.out.println(format_date_time+"\n");
    }
}
