package dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeClass {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();  // date time with time zone
        System.out.println(currentDateTime);

        ZonedDateTime specificDateTime = ZonedDateTime.of(2020, 5, 15, 4, 20, 55, 0, ZoneId.of("America/New_York"));
        System.out.println(specificDateTime);

        ZonedDateTime parisDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println(parisDateTime);
    }
}
