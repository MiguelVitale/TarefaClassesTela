package org.example;

public class Escultura {
    private String ID;
    private String Aparencia;
    private String Material;
    private int Altura;

    //construtor
    public Escultura(String id, String Ap, String Ma, int Alt){
        ID = id;
        Aparencia = Ap;
        Material = Ma;
        Altura = Alt;
    }

    //metodos de acesso get
    public String getID() { return ID; }

    public String getAparencia(){
        return Aparencia;
    }

    public String getMaterial(){
        return Material;
    }

    public int getAltura(){
        return Altura;
    }

    //Expoe a escultura
    public String ExporE(){
        return "voce exibiu a escultura";
    }

    //Retira a escultura
    public String RetiraE(){
        return "voce retirou da exibição a escultura";
    }

    //Vende a escultura
    public String VendeE(){
        return "voce vendeu a escultura";
    }
}
