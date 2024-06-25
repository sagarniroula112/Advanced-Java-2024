package dateapi;

import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {
        Instant currentTimeStamp = Instant.now();  // current timestamp
        System.out.println(currentTimeStamp);

        Instant specificTimeStamp = Instant.ofEpochSecond(162000000);  // specific timestamp
        System.out.println(specificTimeStamp);

        Instant nextHour = currentTimeStamp.plusSeconds(3600);
        System.out.println(nextHour);
    }
}
