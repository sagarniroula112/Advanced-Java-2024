package dateapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationClass {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(9,0);
        LocalTime endTime = LocalTime.of(10,15);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);

        LocalTime newTime = startTime.plus(duration);
        System.out.println(newTime);
    }
}
