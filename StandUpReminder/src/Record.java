import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class Record {
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    Duration workTime;
    Duration totalTime;
    LocalTime temp;
    float ratio;

    Record(){}

    public LocalDate getDate() {
        return date;
    }

    public Duration getWorkTime() {
        return workTime;
    }

    public Duration getTotalTime() {
        return workTime;
    }

    public float getRatio() {
        return ratio;
    }

    public void work(){
        if (this.startTime == null) {
            this.startTime = LocalTime.now();
            this.date = LocalDate.now();
        }
        this.temp = LocalTime.now();
    }

    public void rest() {
        this.workTime = this.workTime.plus(Duration.between(this.temp, LocalTime.now()));
    }

    public void endSession(){
        this.endTime = LocalTime.now();
        this.totalTime = Duration.between(this.endTime, this.startTime);
        this.ratio = workTime.dividedBy(totalTime);
        if (totalTime.compareTo(Duration.parse("3S")) > 0){
            saveRecord(this);
        }
    }

    public void saveRecord (Record record) {
        String filePath = "records.csv";
        try (PrintWriter writer = new PrintWriter((new File(filePath)))){
            writer.println(record.getDate() + "," + getTotalTime() + "," + getWorkTime() + "," + getRatio());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
