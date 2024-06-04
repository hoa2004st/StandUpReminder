import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "TimerScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));

        TimerScreenController timerScreenController = new TimerScreenController();
        fxmlLoader.setController(timerScreenController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("StandUpReminder");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
