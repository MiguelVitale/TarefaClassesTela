package org.example;

public class Papel {
    private String ID;
    private String Cor;
    private String Tamanho;
    private String Posicao;

    //construtor
    public Papel(String id, String Pos, String Tam, String C){
        ID = id;
        Posicao = Pos;
        Tamanho = Tam;
        Cor = C;
    }

    //metodos de acesso get
    public String getID(){ return ID; }

    public String getTamanho(){
        return Tamanho;
    }

    public String getCor(){
        return Cor;
    }

    public String getPosicao(){
        return Posicao;
    }

    //desenha algo
    public String Desenhar(){
        return "voce desenhou algo no papel";
    }

    //apaga um desenho
    public String Apagar(){
        return "voce apagou um desenho no papel";
    }

    //rasga o papel
    public String Rasgar(){
        return "voce rasgou o papel";
    }

}
