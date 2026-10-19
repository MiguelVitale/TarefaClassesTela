package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class PapelController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Desenhar;
    @FXML
    private Button bt_Apagar;
    @FXML
    private Button bt_Rasgar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Posicao;
    @FXML
    private TextField txtf_Tamanho;
    @FXML
    private TextField txtf_Cor;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Papel> papeis = new ArrayList<Papel>();

    @FXML
    void cadastrar (ActionEvent event){
        Papel p = new Papel(txtf_ID.getText(), txtf_Posicao.getText(), txtf_Tamanho.getText(), txtf_Cor.getText());
        papeis.add(p);
        txtf_ID.clear();
        txtf_Posicao.clear();
        txtf_Tamanho.clear();
        txtf_Cor.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Papel p2;

        for(int i=0; i< papeis.size(); i++){
            p2=papeis.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Posição: " + p2.getPosicao() + "\n");
                txta_TextoPropriedades.appendText("Tamanho: " + p2.getTamanho() + "\n");
                txta_TextoPropriedades.appendText("Cor: " + p2.getCor() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void desenhar (ActionEvent event){
        txta_Acoes.clear();

        Papel p2;

        for(int i=0; i< papeis.size(); i++){
            p2=papeis.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.Desenhar() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void apagar (ActionEvent event){
        txta_Acoes.clear();

        Papel p2;

        for(int i=0; i< papeis.size(); i++){
            p2=papeis.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.Apagar() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void rasgar (ActionEvent event){
        txta_Acoes.clear();

        Papel p2;

        for(int i=0; i< papeis.size(); i++){
            p2=papeis.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(p2.Rasgar() + " " + p2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
