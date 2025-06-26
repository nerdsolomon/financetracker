package pages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Login {
    private static TextField usernameField;
    private static PasswordField passwordField;
    private static Button submitButton, nextPageButton; 
    @SuppressWarnings("unused")
    public static VBox show(BorderPane app) {

        Label header = new Label("   📥\nLogin");
        header.setStyle("-fx-font-size:30px; -fx-font-weight:bold;");

        usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setMaxWidth(300);

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(300);

        submitButton = new Button("Submit");
        submitButton.setMaxWidth(300);

        Text text = new Text("Don't have an account?");

        nextPageButton = new Button("Register");
        nextPageButton.setMaxWidth(300);
        nextPageButton.setOnAction(e -> app.setCenter(Register.show(app)));
        

        VBox layout = new VBox();
        layout.setSpacing(20);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(header, usernameField, passwordField, submitButton, text, nextPageButton);
        return layout;
    }
}
