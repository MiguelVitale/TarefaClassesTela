package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class RoupaController {
    //botões
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
    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Cor;
    @FXML
    private TextField txtf_Marca;
    @FXML
    private TextField txtf_Material;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Ações;


    ArrayList<Roupa> roupas = new ArrayList<Roupa>();

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
