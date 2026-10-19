package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class EsculturaController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Exibir;
    @FXML
    private Button bt_Retirar;
    @FXML
    private Button bt_Vender;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Aparencia;
    @FXML
    private TextField txtf_Material;
    @FXML
    private TextField txtf_Altura;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Escultura> esculturas = new ArrayList<Escultura>();

    @FXML
    void cadastrar (ActionEvent event){
        Escultura e = new Escultura(txtf_ID.getText(), txtf_Aparencia.getText(), txtf_Material.getText(), Integer.parseInt(txtf_Altura.getText()));
        esculturas.add(e);
        txtf_ID.clear();
        txtf_Aparencia.clear();
        txtf_Material.clear();
        txtf_Altura.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Escultura e2;

        for(int i=0; i< esculturas.size(); i++){
            e2=esculturas.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Aparência: " + e2.getAparencia() + "\n");
                txta_TextoPropriedades.appendText("Material: " + e2.getMaterial() + "\n");
                txta_TextoPropriedades.appendText("Altura: " + e2.getAltura() + "cm \n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void exibir (ActionEvent event){
        txta_Acoes.clear();

        Escultura e2;

        for(int i=0; i< esculturas.size(); i++){
            e2=esculturas.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.ExporE() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Escultura e2;

        for(int i=0; i< esculturas.size(); i++){
            e2=esculturas.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.RetiraE() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void vender (ActionEvent event){
        txta_Acoes.clear();

        Escultura e2;

        for(int i=0; i< esculturas.size(); i++){
            e2=esculturas.get(i);
            if(e2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(e2.VendeE() + " " + e2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
