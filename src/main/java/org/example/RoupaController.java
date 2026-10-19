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
    private TextArea txta_Acoes;


    ArrayList<Roupa> roupas = new ArrayList<Roupa>();

    @FXML
    void cadastrar (ActionEvent event){
        Roupa r = new Roupa(txtf_ID.getText(), txtf_Cor.getText(), txtf_Marca.getText(), txtf_Material.getText());
        roupas.add(r);
        txtf_ID.clear();
        txtf_Cor.clear();
        txtf_Marca.clear();
        txtf_Material.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Roupa r2;

        for(int i=0; i< roupas.size(); i++){
            r2=roupas.get(i);
            if(r2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Cor: " + r2.getCor() + "\n");
                txta_TextoPropriedades.appendText("Marca: " + r2.getMarca() + "\n");
                txta_TextoPropriedades.appendText("Material: " + r2.getMaterial() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void vestir (ActionEvent event){
        txta_Acoes.clear();

        Roupa r2;

        for(int i=0; i< roupas.size(); i++){
            r2=roupas.get(i);
            if(r2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(r2.Vestir() + " " + r2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Roupa r2;

        for(int i=0; i< roupas.size(); i++){
            r2=roupas.get(i);
            if(r2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(r2.Retirar() + " " + r2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void lavar (ActionEvent event){
        txta_Acoes.clear();

        Roupa r2;

        for(int i=0; i< roupas.size(); i++){
            r2=roupas.get(i);
            if(r2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(r2.Lavar() + " " + r2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
