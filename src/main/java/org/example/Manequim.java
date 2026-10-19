package org.example;

public class Manequim {
    private String ID;
    private int Altura;
    private String Sexo;
    private String Pose;



    //construtor
    public Manequim(String id, String Pos, int Alt, String Sex){
        ID = id;
        Pose = Pos;
        Altura = Alt;
        Sexo = Sex;
    }

    //metodo de acesso get
    public String getID() { return ID; }

    public String getPose(){
        return Pose;
    }

    public String getSexo(){
        return Sexo;
    }

    public int getAltura(){
        return Altura;
    }

    //veste o manequim
    public String ColocarR(){
        return "Voce vestiu o manequim";
    }

    //desveste o manequim
    public String Desvestir(){
        return "Voce desvestiu o manequim";
    }

    //exibe o manequim na vitrine
    public String Exibir(){
        return "Voce exibiu o manequim";
    }

    //retira o manequim da vitrine
    public String TirarMan(){
        return "Voce retirou o manequim";
    }

}