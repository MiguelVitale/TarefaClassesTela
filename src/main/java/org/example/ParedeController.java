package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class ParedeController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Pendurar;
    @FXML
    private Button bt_Retirar;
    @FXML
    private Button bt_Pregar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Cor;
    @FXML
    private TextField txtf_Textura;
    @FXML
    private TextField txtf_Expessura;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Parede> paredes = new ArrayList<Parede>();

    @FXML
    void cadastrar (ActionEvent event){
        Parede p = new Parede(txtf_ID.getText(), txtf_Cor.getText(), txtf_Textura.getText(), Integer.parseInt(txtf_Expessura.getText()));
        paredes.add(p);
        txtf_ID.clear();
        txtf_Cor.clear();
        txtf_Textura.clear();
        txtf_Expessura.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Parede p2;

        for(int i=0; i< paredes.size(); i++){
            p2=paredes.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Cor: " + p2.getCor() + "\n");
                txta_TextoPropriedades.appendText("Textura: " + p2.getTextura() + "\n");
                txta_TextoPropriedades.appendText("Expessura: " + p2.getExpessura() + "cm \n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void pendurar (ActionEvent event){
        txta_Acoes.clear();

        Parede p2;

        for(int i=0; i< paredes.size(); i++){
            p2=paredes.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.Pendurar() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Parede p2;

        for(int i=0; i< paredes.size(); i++){
            p2=paredes.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.RetirarP() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void pregar (ActionEvent event){
        txta_Acoes.clear();

        Parede p2;

        for(int i=0; i< paredes.size(); i++){
            p2=paredes.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.Prego() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
