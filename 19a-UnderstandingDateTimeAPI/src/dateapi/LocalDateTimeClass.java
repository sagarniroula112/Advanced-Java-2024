package dateapi;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2020, 5, 15, 10, 30, 59);
        System.out.println(specificDateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2020-05-16T10:15:59");
        System.out.println(parsedDateTime);

        LocalDateTime nextDaySameTime = currentDateTime.plusDays(1);
        System.out.println(nextDaySameTime);
    }
}
