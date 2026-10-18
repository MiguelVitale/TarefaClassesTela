package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class InicialController {
    @FXML
    private Button bt_Roupa;

    @FXML
    void switchToRoupa (ActionEvent event) throws IOException {
        App.setRoot("roupa");
    }
}
