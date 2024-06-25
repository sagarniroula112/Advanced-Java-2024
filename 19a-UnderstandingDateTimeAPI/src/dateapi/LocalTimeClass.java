package dateapi;

import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();  // current time
        System.out.println(currentTime);

        LocalTime specificTime = LocalTime.of(10,30,59);  // specific time
        System.out.println(specificTime);

        LocalTime parsedTime = LocalTime.parse("10:29:33");  // string to proper time format
        System.out.println(parsedTime);

        LocalTime nextHour = currentTime.plusHours(1);  // time arithmetic
        System.out.println(nextHour);
    }
}
