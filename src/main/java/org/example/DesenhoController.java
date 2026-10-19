package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class DesenhoController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Adicionar;
    @FXML
    private Button bt_Remover;
    @FXML
    private Button bt_Refazer;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Aparencia;
    @FXML
    private TextField txtf_Estilo;
    @FXML
    private TextField txtf_Local;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Desenho> desenhos = new ArrayList<Desenho>();

    @FXML
    void cadastrar (ActionEvent event){
        Desenho d = new Desenho(txtf_ID.getText(), txtf_Aparencia.getText(), txtf_Estilo.getText(), txtf_Local.getText());
        desenhos.add(d);
        txtf_ID.clear();
        txtf_Aparencia.clear();
        txtf_Estilo.clear();
        txtf_Local.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Desenho d2;

        for(int i=0; i< desenhos.size(); i++){
            d2=desenhos.get(i);
            if(d2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Aparência: " + d2.getAparencia() + "\n");
                txta_TextoPropriedades.appendText("Estilo: " + d2.getEstilo() + "\n");
                txta_TextoPropriedades.appendText("Local no papel: " + d2.getLocal() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void adicionar (ActionEvent event){
        txta_Acoes.clear();

        Desenho d2;

        for(int i=0; i< desenhos.size(); i++){
            d2=desenhos.get(i);
            if(d2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(d2.Adicionar() + " " + d2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void remover (ActionEvent event){
        txta_Acoes.clear();

        Desenho d2;

        for(int i=0; i< desenhos.size(); i++){
            d2=desenhos.get(i);
            if(d2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(d2.Remover() + " " + d2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void refazer (ActionEvent event){
        txta_Acoes.clear();

        Desenho d2;

        for(int i=0; i< desenhos.size(); i++){
            d2=desenhos.get(i);
            if(d2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(d2.Refazer() + " " + d2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
