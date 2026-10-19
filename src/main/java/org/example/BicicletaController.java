package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class BicicletaController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Pedalar;
    @FXML
    private Button bt_Frear;
    @FXML
    private Button bt_Buzinar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Cor;
    @FXML
    private TextField txtf_Modelo;
    @FXML
    private TextField txtf_Ano;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    @FXML
    void cadastrar (ActionEvent event){
        Bicicleta b = new Bicicleta(txtf_ID.getText(), txtf_Cor.getText(), Integer.parseInt(txtf_Ano.getText()), txtf_Modelo.getText());
        bicicletas.add(b);
        txtf_ID.clear();
        txtf_Cor.clear();
        txtf_Ano.clear();
        txtf_Modelo.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Bicicleta b2;

        for(int i=0; i< bicicletas.size(); i++){
            b2=bicicletas.get(i);
            if(b2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Cor: " + b2.getCor() + "\n");
                txta_TextoPropriedades.appendText("Ano: " + b2.getAno() + "\n");
                txta_TextoPropriedades.appendText("Modelo: " + b2.getModelo() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void pedalar (ActionEvent event){
        txta_Acoes.clear();

        Bicicleta b2;

        for(int i=0; i< bicicletas.size(); i++){
            b2=bicicletas.get(i);
            if(b2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(b2.Pedalar() + " " + b2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void frear (ActionEvent event){
        txta_Acoes.clear();

        Bicicleta b2;

        for(int i=0; i< bicicletas.size(); i++){
            b2=bicicletas.get(i);
            if(b2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(b2.Frear() + " " + b2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void buzinar (ActionEvent event){
        txta_Acoes.clear();

        Bicicleta b2;

        for(int i=0; i< bicicletas.size(); i++){
            b2=bicicletas.get(i);
            if(b2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(b2.Buzinar() + " " + b2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
