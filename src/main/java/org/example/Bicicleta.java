package org.example;

public class Bicicleta {
    private String ID;
    private String Cor;
    private String Modelo;
    private int Ano;

    //construtor
    public Bicicleta(String id, String C, int A,String Mod){
        ID = id;
        Cor = C;
        Ano = A;
        Modelo = Mod;
    }

    //metodo de acesso get
    public String getID(){ return ID; }

    public String getCor(){
        return Cor;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getAno(){
        return Ano;
    }

    //pedala na bicicleta
    public String Pedalar(){
        return "voce pedala na bicicleta";
    }

    //freia a bicicleta
    public String Frear(){
        return "voce freia a bicicleta";
    }

    //usa a buzina da bicicleta
    public String Buzinar(){
        return "voce usou a buzina da bicicleta";
    }

}