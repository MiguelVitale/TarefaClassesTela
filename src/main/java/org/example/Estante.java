package org.example;


public class Estante {
    private String ID;
    private float Tamanho;
    private int QntEspaco;
    private String Material;



    //construtor
    public Estante(String id, int Espa,float Tam, String Mat){
        ID = id;
        QntEspaco = Espa;
        Tamanho = Tam ;
        Material = Mat;
    }

    //metodo de acesso get
    public String getID(){ return ID; }

    public float getTamanho(){
        return Tamanho;
    }

    public String getMaterial(){
        return Material;
    }

    public int getQntEspaco(){
        return QntEspaco;
    }

    //guarda as roupas na estante
    public String Guardar(){
        return "Voce guardou as roupas na estante";
    }

    //retira as roupas da estante
    public String RetirarE(){
        return "Voce retirou as roupas da estante";
    }

    //Organiza a estante
    public String Organizar(){
        return "Voce organizou a estante";
    }

}