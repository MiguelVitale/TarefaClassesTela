package org.example;

public class Pessoa {
    private String ID;
    private int Idade;
    private int Altura;
    private String Nome;

    //construtor
    public Pessoa(String id, String Nom, int Ida, int Alt){
        ID = id;
        Nome = Nom;
        Idade = Ida;
        Altura = Alt;
    }

    //metodo de acesso get
    public String getID(){ return ID; }

    public int getIdade(){
        return Idade;
    }

    public int getAltura(){
        return Altura;
    }

    public String getNome(){
        return Nome;
    }

    //faz a pessoa andar
    public String Andar(){
        return "começa a andar";
    }

    //faz a pessoa parar
    public String Parar(){
        return "para no lugar";
    }

    //faz a pessoa se coçar
    public String Cocar(){
        return "se coçou";
    }
}