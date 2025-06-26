import components.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pages.Login;

public class App extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception { 
        BorderPane layout = new BorderPane();
        layout.setCenter(Login.show(layout));
        window = primaryStage;
        window.setScene(new Scene(layout, 600, 400));
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
