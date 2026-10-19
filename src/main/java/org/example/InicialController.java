package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class InicialController {
    @FXML
    private Button bt_Roupa;
    @FXML
    private Button bt_Estante;


    @FXML
    void switchToRoupa (ActionEvent event) throws IOException {
        App.setRoot("roupa");
    }

    @FXML
    void switchToEstante (ActionEvent event) throws IOException{
        App.setRoot("estante");
    }
}
