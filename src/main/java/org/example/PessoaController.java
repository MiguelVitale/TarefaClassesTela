package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class PessoaController {

    //botões
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Cadastrar;
    @FXML
    private Button bt_Propriedades;

    //botões de métodos
    @FXML
    private Button bt_Fotossintese;
    @FXML
    private Button bt_CrescerF;
    @FXML
    private Button bt_CairF;

    //text fields
    @FXML
    private TextField txtf_ID;
    @FXML
    private TextField txtf_Nome;
    @FXML
    private TextField txtf_Idade;
    @FXML
    private TextField txtf_Altura;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    @FXML
    void cadastrar (ActionEvent event){
        Pessoa p = new Pessoa(txtf_ID.getText(), txtf_Nome.getText(), Integer.parseInt(txtf_Idade.getText()), Integer.parseInt(txtf_Altura.getText()));
        pessoas.add(p);
        txtf_ID.clear();
        txtf_Altura.clear();
        txtf_Idade.clear();
        txtf_Nome.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Pessoa p2;

        for(int i=0; i< pessoas.size(); i++){
            p2=pessoas.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Nome: " + p2.getNome() + "\n");
                txta_TextoPropriedades.appendText("Idade: " + p2.getIdade() + " anos \n");
                txta_TextoPropriedades.appendText("Altura: " + p2.getAltura() + "cm \n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void andar (ActionEvent event){
        txta_Acoes.clear();

        Pessoa p2;

        for(int i=0; i< pessoas.size(); i++){
            p2=pessoas.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a pessoa " + p2.getID() + " " + p2.Andar());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void parar (ActionEvent event){
        txta_Acoes.clear();

        Pessoa p2;

        for(int i=0; i< pessoas.size(); i++){
            p2=pessoas.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a pessoa " + p2.getID() + " " + p2.Parar());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void cocar (ActionEvent event){
        txta_Acoes.clear();

        Pessoa p2;

        for(int i=0; i< pessoas.size(); i++){
            p2=pessoas.get(i);
            if(p2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a pessoa " + p2.getID() + " " + p2.Cocar());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
