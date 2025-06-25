import components.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception { 
        StackPane root = new StackPane();

        window = primaryStage;
        window.setScene(new Scene(root, 800, 600));
        window.getIcons().add(new Image("assets/nerd.png"));
        window.setTitle("Finance Tracker");
        window.setOnCloseRequest(e -> { e.consume(); closeApp(); });
        window.show();
    }

    private void closeApp() {
        boolean response = ConfirmBox.show("Are you sure you want to close the app?");
        if (response) {
            window.close();
        }
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
