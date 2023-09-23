package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;

import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.util.Optional;

public class LoginController {
    public static boolean check = false;
    @FXML
    public TextField tfUsername, tfPassword;

    public void Submit (ActionEvent event) {
        String username = tfUsername.getText();
        String password = tfPassword.getText();
        if (username.compareTo("quang") == 0 && password.compareTo("123") == 0) {
            check = true;
            final Node source = (Node) event.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Có lỗi xảy ra");
            alert.show();
        }
    }
}
