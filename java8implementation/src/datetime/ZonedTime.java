package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTime {
    public static void main(String[] args) {
        ZonedDateTime z=ZonedDateTime.now();
        System.out.println(z.getZone());
        System.out.println(z.getOffset());
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.atZone(ZoneId.of("America/Chicago")));


    }
}
