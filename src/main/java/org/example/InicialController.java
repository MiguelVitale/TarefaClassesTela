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
    private Button bt_Manequim;
    @FXML
    private Button bt_Arvore;
    @FXML
    private Button bt_Pessoa;
    @FXML
    private Button bt_Bicicleta;
    @FXML
    private Button bt_Parede;
    @FXML
    private Button bt_Escultura;
    @FXML
    private Button bt_Mascara;
    @FXML
    private Button bt_Papel;
    @FXML
    private Button bt_Desenho;

    @FXML
    void switchToRoupa (ActionEvent event) throws IOException {
        App.setRoot("roupa");
    }

    @FXML
    void switchToEstante (ActionEvent event) throws IOException{
        App.setRoot("estante");
    }

    @FXML
    void switchToManequim (ActionEvent event) throws IOException{
        App.setRoot("manequim");
    }

    @FXML
    void switchToArvore (ActionEvent event) throws IOException {
        App.setRoot("arvore");
    }

    @FXML
    void switchToPessoa (ActionEvent event) throws IOException {
        App.setRoot("pessoa");
    }

    @FXML
    void switchToBicicleta (ActionEvent event) throws IOException{
        App.setRoot("bicicleta");
    }

    @FXML
    void switchToParede (ActionEvent event) throws IOException{
        App.setRoot("parede");
    }

    @FXML
    void switchToEscultura (ActionEvent event) throws IOException{
        App.setRoot("escultura");
    }

    @FXML
    void switchToMascara (ActionEvent event) throws IOException{
        App.setRoot("mascara");
    }

    @FXML
    void switchToPapel (ActionEvent event) throws IOException{
        App.setRoot("papel");
    }

    @FXML
    void switchToDesenho (ActionEvent event) throws IOException{
        App.setRoot("desenho");
    }
}
