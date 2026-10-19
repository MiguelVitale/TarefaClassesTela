package org.example;


public class Arvore {
    private String ID;
    private int Altura;
    private String Tipo;
    private int Idade;



    //construtor
    public Arvore(String id, int Alt, int Ida, String Tip){
        ID = id;
        Altura = Alt;
        Idade = Ida;
        Tipo = Tip ;
    }

    //metodo de acesso get
    public String getID() { return ID; }

    public String getTipo(){
        return Tipo;
    }

    public int getAltura(){
        return Altura;
    }

    public int getIdade(){
        return Idade;
    }

    //faz fotossintese
    public String fotossintese(){
        return "fez fotossintese";
    }

    //cresce frutos
    public String CrescerF(){
        return "cresceu alguns frutos";
    }

    //faz os frutos cairem da arvore
    public String CairF(){
        return "deixou alguns frutos cairem";
    }

}