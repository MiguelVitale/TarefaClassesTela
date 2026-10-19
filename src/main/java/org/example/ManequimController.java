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
    private Button bt_Vestir;
    @FXML
    private Button bt_Desvestir;
    @FXML
    private Button bt_Exibir;
    @FXML
    private Button bt_Retirar;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Pose;
    @FXML
    private TextField txtf_Altura;
    @FXML
    private TextField txtf_Sexo;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Manequim> manequims = new ArrayList<Manequim>();

    @FXML
    void cadastrar (ActionEvent event){
        Manequim m = new Manequim(txtf_ID.getText(), txtf_Pose.getText(), Integer.parseInt(txtf_Altura.getText()), txtf_Sexo.getText());
        manequims.add(m);
        txtf_ID.clear();
        txtf_Pose.clear();
        txtf_Altura.clear();
        txtf_Sexo.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Manequim m2;

        for(int i=0; i< manequims.size(); i++){
            m2=manequims.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Pose: " + m2.getPose() + "\n");
                txta_TextoPropriedades.appendText("Altura: " + m2.getAltura() + "cm \n");
                txta_TextoPropriedades.appendText("Sexo: " + m2.getSexo() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void vestir (ActionEvent event){
        txta_Acoes.clear();

        Manequim m2;

        for(int i=0; i< manequims.size(); i++){
            m2=manequims.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.ColocarR() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void desvestir (ActionEvent event){
        txta_Acoes.clear();

        Manequim m2;

        for(int i=0; i< manequims.size(); i++){
            m2=manequims.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.Desvestir() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void exibir (ActionEvent event){
        txta_Acoes.clear();

        Manequim m2;

        for(int i=0; i< manequims.size(); i++){
            m2=manequims.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.Exibir() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void retirar (ActionEvent event){
        txta_Acoes.clear();

        Manequim m2;

        for(int i=0; i< manequims.size(); i++){
            m2=manequims.get(i);
            if(m2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText(m2.TirarMan() + " " + m2.getID());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
