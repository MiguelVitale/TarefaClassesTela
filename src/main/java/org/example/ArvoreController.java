package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class ArvoreController {

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
    private TextField txtf_Altura;
    @FXML
    private TextField txtf_Idade;
    @FXML
    private TextField txtf_Tipo;
    //text areas
    @FXML
    private TextArea txta_TextoPropriedades;
    @FXML
    private TextArea txta_Acoes;

    ArrayList<Arvore> arvores = new ArrayList<Arvore>();

    @FXML
    void cadastrar (ActionEvent event){
        Arvore a = new Arvore(txtf_ID.getText(), Integer.parseInt(txtf_Altura.getText()), Integer.parseInt(txtf_Idade.getText()), txtf_Tipo.getText());
        arvores.add(a);
        txtf_ID.clear();
        txtf_Altura.clear();
        txtf_Idade.clear();
        txtf_Tipo.clear();
    }

    @FXML
    void mostraPropriedades (ActionEvent event){
        txta_TextoPropriedades.clear();

        Arvore a2;

        for(int i=0; i< arvores.size(); i++){
            a2=arvores.get(i);
            if(a2.getID().equals(txtf_ID.getText())) {
                txta_TextoPropriedades.appendText("Altura: " + a2.getAltura() + "M\n");
                txta_TextoPropriedades.appendText("Idade: " + a2.getIdade() + " anos \n");
                txta_TextoPropriedades.appendText("Tipo: " + a2.getTipo() + "\n");
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void fotossintese (ActionEvent event){
        txta_Acoes.clear();

        Arvore a2;

        for(int i=0; i< arvores.size(); i++){
            a2=arvores.get(i);
            if(a2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a árvore " + a2.getID() + " " + a2.fotossintese());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void crescerF (ActionEvent event){
        txta_Acoes.clear();

        Arvore a2;

        for(int i=0; i< arvores.size(); i++){
            a2=arvores.get(i);
            if(a2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a árvore " + a2.getID() + " " + a2.CrescerF());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void cairF (ActionEvent event){
        txta_Acoes.clear();

        Arvore a2;

        for(int i=0; i< arvores.size(); i++){
            a2=arvores.get(i);
            if(a2.getID().equals(txtf_ID.getText())) {
                txta_Acoes.appendText("a árvore " + a2.getID() + " " + a2.CairF());
            }
        }
        txtf_ID.clear();
    }

    @FXML
    void switchToInicial (ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
