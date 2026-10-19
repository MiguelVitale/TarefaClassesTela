package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class MascaraController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Vestir;
    @FXML
    private Button bt_Retirar;
    @FXML
    private Button bt_Pegar;
    @FXML
    private Button bt_Guardar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Aparencia;
    @FXML
    private TextField txtf_Material;
    @FXML
    private TextField txtf_Pais;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Mascara> mascaras = new ArrayList<Mascara>();

    @FXML
    void cadastrar (ActionEvent event){
        Mascara m = new Mascara(txtf_ID.getText(), txtf_Aparencia.getText(), txtf_Material.getText(), txtf_Pais.getText());
        mascaras.add(m);
        txtf_ID.clear();
        txtf_Aparencia.clear();
        txtf_Material.clear();
        txtf_Pais.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Mascara m2;

        for(int i=0; i< mascaras.size(); i++){
            m2=mascaras.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Aparência: " + m2.getAparencia() + "\n");
                txta_TextoPropriedades.appendText("Material: " + m2.getMaterial() + "\n");
                txta_TextoPropriedades.appendText("País de origem: " + m2.getPais() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void vestir (ActionEvent event){
        txta_Acoes.clear();

        Mascara m2;

        for(int i=0; i< mascaras.size(); i++){
            m2=mascaras.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.VestirM() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Mascara m2;

        for(int i=0; i< mascaras.size(); i++){
            m2=mascaras.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.RetiraM() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void pegar (ActionEvent event){
        txta_Acoes.clear();

        Mascara m2;

        for(int i=0; i< mascaras.size(); i++){
            m2=mascaras.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.PegaM() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void guardar (ActionEvent event){
        txta_Acoes.clear();

        Mascara m2;

        for(int i=0; i< mascaras.size(); i++){
            m2=mascaras.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.Guarda() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
