package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.swing.*;
import java.io.IOException;

public class RoupaController {
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;
    @FXML
    private Button bt_Vestir;
    @FXML
    private Button bt_Retirar;
    @FXML
    private Button bt_Lavar;

    @FXML
    void cadastrar (ActionEvent event){

    }

    @FXML
    void mostraPropriedades (ActionEvent event){

    }

    @FXML
    void vestir (ActionEvent event){

    }

    @FXML
    void retirar (ActionEvent event){

    }

    @FXML
    void lavar (ActionEvent event){

    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
