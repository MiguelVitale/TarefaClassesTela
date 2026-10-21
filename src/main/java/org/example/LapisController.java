package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class LapisController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Apontar;
    @FXML
    private Button bt_Guardar;
    @FXML
    private Button bt_Pegar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Cor;
    @FXML
    private TextField txtf_Tamanho;
    @FXML
    private TextField txtf_Peso;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Lapis> lapisS = new ArrayList<Lapis>();

    @FXML
    void cadastrar (ActionEvent event){
        Lapis l = new Lapis(txtf_ID.getText(), txtf_Cor.getText(), Integer.parseInt(txtf_Tamanho.getText()), Float.parseFloat(txtf_Peso.getText()));
        lapisS.add(l);
        txtf_ID.clear();
        txtf_Cor.clear();
        txtf_Tamanho.clear();
        txtf_Peso.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Lapis l2;

        for(int i=0; i< lapisS.size(); i++){
            l2=lapisS.get(i);
            if(l2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Cor: " + l2.getGrafiteCor() + "\n");
                txta_TextoPropriedades.appendText("Tamanho: " + l2.getTamanho() + "cm \n");
                txta_TextoPropriedades.appendText("Peso: " + l2.getPeso() + "g\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void apontar (ActionEvent event){
        txta_Acoes.clear();

        Lapis l2;

        for(int i=0; i< lapisS.size(); i++){
            l2=lapisS.get(i);
            if(l2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(l2.Apontar() + " " + l2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void guardar (ActionEvent event){
        txta_Acoes.clear();

        Lapis l2;

        for(int i=0; i< lapisS.size(); i++){
            l2=lapisS.get(i);
            if(l2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(l2.GuardarL() + " " + l2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void pegar (ActionEvent event){
        txta_Acoes.clear();

        Lapis l2;

        for(int i=0; i< lapisS.size(); i++){
            l2=lapisS.get(i);
            if(l2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(l2.PegarL() + " " + l2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
