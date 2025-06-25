package components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    private static boolean response;
    @SuppressWarnings("unused")
    public static boolean show(String message) {
        Stage window = new Stage();

        Text confirmationText = new Text(message);
        confirmationText.setStyle("-fx-font-size:13px");

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> { response = true; window.close(); });
        Button noButton = new Button("No");
        noButton.setOnAction(e -> { response = false; window.close(); });

        HBox buttonGroup = new HBox();
        buttonGroup.getChildren().addAll(yesButton, noButton);
        buttonGroup.setSpacing(20);
        buttonGroup.setAlignment(Pos.CENTER);

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(confirmationText, buttonGroup);

        window.setScene(new Scene(layout, 300, 100));
        window.initModality(Modality.APPLICATION_MODAL);
        window.getIcons().add(new Image("assets/nerd.png"));
        window.setTitle("Confirm action");
        window.showAndWait();
        return response;
    }
}
