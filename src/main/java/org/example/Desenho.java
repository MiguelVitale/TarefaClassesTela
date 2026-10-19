package org.example;

public class Desenho {
    private String ID;
    private String Estilo;
    private String Aparencia;
    private String Local;

    //construtor
    public Desenho(String id, String Ap, String Es, String Lo){
        ID = id;
        Aparencia = Ap;
        Estilo = Es;
        Local = Lo;
    }

    //metodos de acesso get
    public String getID() { return ID; }

    public String getEstilo(){
        return Estilo;
    }

    public String getLocal(){
        return Local;
    }

    public String getAparencia(){
        return Aparencia;
    }

    //adiciona detalhes
    public String Adicionar(){
        return "voce adiciona detalhes ao desenho";
    }

    //remove detalhes
    public String Remover(){
        return "voce remove detalhes do deseho";
    }

    //refaz o desenho
    public String Refazer(){
        return "voce refaz o desenho";
    }

}
