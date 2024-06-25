package dateapi;

import java.time.Period;
import java.time.LocalDate;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020,1,2);
        LocalDate endDate = LocalDate.of(2020, 1, 4);

        Period period = Period.between(startDate, endDate);
        System.out.println(period);

        LocalDate newDate = startDate.plus(period);
        System.out.println(newDate);
    }
}