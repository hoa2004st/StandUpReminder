import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TimerScreenController {

    @FXML
    private ToggleGroup TimerStateToggle;

    @FXML
    private Button btnEndSession;

    @FXML
    private ToggleButton btnPause;

    @FXML
    private ToggleButton btnRest;

    @FXML
    private ToggleButton btnWork;

    @FXML
    private TableColumn<RecordLoader, Integer> colNo;

    @FXML
    private TableColumn<RecordLoader, String> colDate;

    @FXML
    private TableColumn<RecordLoader, String> colTotal;

    @FXML
    private TableColumn<RecordLoader, String> colWork;

    @FXML
    private TableColumn<RecordLoader, String> colRatio;

    @FXML
    private Label lblTimer;

    @FXML
    private Label lblTotal;

    @FXML
    private TextField tfRemindAfter;

    @FXML
    private TableView<RecordLoader> tblRecords;

    @FXML
    void btnEndSessionPressed(ActionEvent event) {

    }

    @FXML
    void btnPausePressed(ActionEvent event) {

    }

    @FXML
    void btnRestPressed(ActionEvent event) {

    }

    @FXML
    void btnWorkPressed(ActionEvent event) {

    }

    TimerScreenController() {}

    @FXML
    public void initialize() {
        colDate.setCellValueFactory(new PropertyValueFactory<RecordLoader, String>("date"));
        colDate.setCellValueFactory(new PropertyValueFactory<RecordLoader, String>("totalTime"));
        colDate.setCellValueFactory(new PropertyValueFactory<RecordLoader, String>("workTime"));
        colDate.setCellValueFactory(new PropertyValueFactory<RecordLoader, String>("Ratio"));

        if (RecordLoader.records != null) {
            tblRecords.setItems(RecordLoader.records);
        }
    }
}

