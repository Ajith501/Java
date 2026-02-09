import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateEmailHandler {
    public static void main(String[] args) {
        LocalDate date =  LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Today's Date: " + date.format(DateTimeFormatter.ofPattern("yyyy")));
        System.out.println("Today's Date: " + date.format(DateTimeFormatter.ofPattern("YY-MMMM-DD")));
        System.out.println("Today's Date: " + date.format(DateTimeFormatter.ofPattern("DD-MM-YY")));
        System.out.println(time);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("OTP sent at " + dt);
        System.out.println("OTP valid till " + dt.plusMinutes(10));

        System.out.println("JWT Token valid till " + dt.plusDays(1));
            System.out.println(dt.getYear());
            System.out.println(dt.getMonth());
            System.out.println(dt.getDayOfMonth());
    }
}
