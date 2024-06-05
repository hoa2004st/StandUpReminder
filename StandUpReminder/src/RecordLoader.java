import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RecordLoader {
    Integer no;
    String date;
    String totalTime;
    String workTime;
    String ratio;
    public static ObservableList<RecordLoader> records;

    RecordLoader(String date, String totalTime, String workTime, String ratio) {
        this.date = date;
        this.totalTime = totalTime;
        this.workTime = workTime;
        this.ratio = ratio;
    }

    public static List<RecordLoader> loadRecords(String pathToCsvFile) {
        String filePath = "records.csv";
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                RecordLoader recordLoader = new RecordLoader(data[0], data[1], data[2], data[3]);
                records.add(recordLoader);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        };
        return RecordLoader.records;
    }

}
