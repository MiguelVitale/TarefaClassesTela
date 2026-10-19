package org.example;

public class Roupa {
    private String ID;
    private String Cor;
    private String Marca;
    private String Material;



    //construtor
    public Roupa(String id, String Co, String Marc, String Mate){
        ID = id;
        Cor = Co;
        Marca = Marc;
        Material = Mate;
    }

    //metodo de acesso get
    public String getCor(){
        return Cor;
    }

    public String getMaterial(){
        return Material;
    }

    public String getMarca(){
        return Marca;
    }

    //veste a roupa
    public void Vestir(){
        System.out.println("Voce vestiu a roupa");
    }

    //retira a roupa
    public void Retirar(){
        System.out.println("Voce retirou a roupa");
    }

    //lava a roupa
    public void Lavar(){
        System.out.println("Voce lavou a roupa");
    }

}