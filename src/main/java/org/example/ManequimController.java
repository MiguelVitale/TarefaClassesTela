package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class ManequimController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Guardar;
    @FXML
    private Button bt_Retirar;
    @FXML
    private Button bt_Organizar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Tamanho;
    @FXML
    private TextField txtf_QntEspacos;
    @FXML
    private TextField txtf_Material;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Estante> estantes = new ArrayList<Estante>();

    @FXML
    void cadastrar (ActionEvent event){
        Estante e = new Estante(txtf_ID.getText(), Integer.parseInt(txtf_QntEspacos.getText()), Float.parseFloat(txtf_Tamanho.getText()), txtf_Material.getText());
        estantes.add(e);
        txtf_ID.clear();
        txtf_Tamanho.clear();
        txtf_QntEspacos.clear();
        txtf_Material.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Estante e2;

        for(int i=0; i< estantes.size(); i++){
            e2=estantes.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Tamanho: " + e2.getTamanho() + "M^2 \n");
                txta_TextoPropriedades.appendText("Quantidade de espaços: " + e2.getQntEspaco() + "\n");
                txta_TextoPropriedades.appendText("Material: " + e2.getMaterial() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void guardar (ActionEvent event){
        txta_Acoes.clear();

        Estante e2;

        for(int i=0; i< estantes.size(); i++){
            e2=estantes.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.Guardar() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Estante e2;

        for(int i=0; i< estantes.size(); i++){
            e2=estantes.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.RetirarE() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void organizar (ActionEvent event){
        txta_Acoes.clear();

        Estante e2;

        for(int i=0; i< estantes.size(); i++){
            e2=estantes.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.Organizar() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
