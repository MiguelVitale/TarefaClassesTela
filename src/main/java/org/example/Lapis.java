package org.example;

public class Lapis {
    private String ID;
    private int Tamanho;
    private String GrafiteCor;
    private float Peso;

    //construtor
    public Lapis(String id, String Grafite, int Tam, float Pe){
        ID = id;
        GrafiteCor = Grafite;
        Tamanho = Tam;
        Peso = Pe;
    }

    //metodos de acesso get
    public String getID() { return ID; }

    public int getTamanho(){
        return Tamanho;
    }

    public String getGrafiteCor(){
        return GrafiteCor;
    }

    public float getPeso(){
        return Peso;
    }

    //aponta o lapis
    public String Apontar(){
        return "voce aponta o lapis";
    }

    //guarda o lapis
    public String GuardarL(){
        return "voce guarda o lapis";
    }

    //pega o lapis
    public String PegarL(){
        return "voce pega o lapis";
    }


}
