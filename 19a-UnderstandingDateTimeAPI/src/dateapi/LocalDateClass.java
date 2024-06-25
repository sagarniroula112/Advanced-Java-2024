package dateapi;

import java.time.LocalDate;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // current date
        System.out.println(currentDate);

        LocalDate specificDate = LocalDate.of(2020, 6, 26); // specific date
        System.out.println(specificDate);

        LocalDate parsedDate = LocalDate.parse("2020-05-15"); // string to date format
        System.out.println(parsedDate);

        LocalDate tomorrow = currentDate.plusDays(1);
        System.out.println(tomorrow);
    }
}
