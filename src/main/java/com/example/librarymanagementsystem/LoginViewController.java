package com.example.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginViewController {

    @FXML
    public TextField loginTextField;

    @FXML
    public Button buttonLogin;

    @FXML
    public Label loginError;

    public void onClickEvent(MouseEvent e)
    {
        if(loginTextField.getText() == "")
        {
            loginError.setText("Login field is empty");
            loginError.setVisible(true);
        }
    }
}
