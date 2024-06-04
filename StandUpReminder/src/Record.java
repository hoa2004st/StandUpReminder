import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class Record {
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    Duration workTime;

    int No;
    Record(){    }

    public void start(){
        this.startTime = LocalTime.now();
        this.date = LocalDate.now();
    }
    public void work(){}

    public void rest() {}

    public void pause(){}



    public Duration endSession(){
        this.endTime = LocalTime.now();
        return Duration.between(this.endTime, this.startTime);
    }

}
