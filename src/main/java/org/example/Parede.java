package org.example;

public class Parede {
    private String ID;
    private String Textura;
    private float Expessura;
    private String Cor;

    //construtor
    public Parede(String id, String C, String Tex, float Ex){
        ID = id;
        Cor = C;
        Textura = Tex;
        Expessura = Ex;
    }

    //metodos de acesso get
    public String getID(){ return ID; }

    public String getTextura(){
        return Textura;
    }

    public float getExpessura(){
        return Expessura;
    }

    public String getCor(){
        return Cor;
    }

    //pendura uma mascara
    public String Pendurar(){
        return "voce pendurou uma mascara na parede";
    }

    //tira uma mascara
    public String RetirarP(){
        return "voce tirou uma mascara da parede";
    }

    //coloca um prego na parede
    public String Prego(){
        return "voce colocou um prego na parede";
    }
}
