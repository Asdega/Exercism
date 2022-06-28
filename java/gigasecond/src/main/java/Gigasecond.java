import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    public static final int gigasec = 1000000000;
    public LocalDateTime dateTime;
    
    public Gigasecond(LocalDate moment) {
       this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(gigasec);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
