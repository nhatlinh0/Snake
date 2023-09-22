package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController {
    public boolean check;
    public LoginController() {
        check = false;
    }
    @FXML
    public TextField tfUsername, tfPassword;


    public void Submit (ActionEvent event) {
        String username = tfUsername.getText();
        String password = tfPassword.getText();
        if (username.compareTo("quangkuto") == 0 && password.compareTo("123") == 0) {
            check = true;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Đăng nhập thành công");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Có lỗi xảy ra");
            alert.show();
        }
    }
}
