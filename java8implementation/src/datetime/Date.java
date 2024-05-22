package datetime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Date {
    public static void main(String[] args) {
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
//        System.out.println(dt.with(ChronoField.YEAR,2022));
//        System.out.println(dt.get(ChronoField.DAY_OF_WEEK));
        System.out.println(dt.with(TemporalAdjusters.firstDayOfNextMonth()));
//        System.out.println(dt.minus(1,ChronoUnit.YEARS));
        System.out.println(dt.atTime(12,12));

    }
}
