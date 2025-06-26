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

public class Register {
    private static TextField fullnameField, usernameField;
    private static PasswordField passwordField, confirmPasswordField;
    private static Button submitButton, nextPageButton; 
    @SuppressWarnings("unused")
    public static VBox show(BorderPane app) {

        Label header = new Label("Register");
        header.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");

        fullnameField = new TextField();
        fullnameField.setPromptText("Full Name");
        fullnameField.setMaxWidth(300);

        usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setMaxWidth(300);

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(300);

        confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm Password");
        confirmPasswordField.setMaxWidth(300);

        submitButton = new Button("Submit");
        submitButton.setMaxWidth(300);

        Text text = new Text("Already have an account?");

        nextPageButton = new Button("Back to login");
        nextPageButton.setMaxWidth(300);
        nextPageButton.setOnAction(e -> app.setCenter(Login.show(app)));

        VBox layout = new VBox();
        layout.setSpacing(20);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(header, fullnameField, usernameField, passwordField, confirmPasswordField, submitButton, text, nextPageButton);
        return layout;
    }
}
