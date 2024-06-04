import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

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
    private TableColumn<?, ?> colDay;

    @FXML
    private TableColumn<?, ?> colNo;

    @FXML
    private TableColumn<?, ?> colRatio;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableColumn<?, ?> colWork;

    @FXML
    private Label lblTimer;

    @FXML
    private Label lblTotal;

    @FXML
    private TextField tfRemindAfter;

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
}

