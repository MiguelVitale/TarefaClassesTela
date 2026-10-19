package org.example;

public class Mascara {
    private String ID;
    private String Aparencia;
    private String Material;
    private String Pais;

    //construtor
    public Mascara(String id, String Ap, String Ma, String P){
        ID = id;
        Aparencia = Ap;
        Material = Ma;
        Pais = P;
    }

    //metodos de acesso get
    public String getID(){ return ID; }

    public String getAparencia(){
        return Aparencia;
    }

    public String getMaterial(){
        return Material;
    }

    public String getPais(){
        return Pais;
    }

    //Veste mascara
    public String VestirM(){
        return "voce vestiu a mascara";
    }

    //Retira a mascara
    public String RetiraM(){
        return "voce retirou a mascara";
    }

    //Guarda a mascara
    public String Guarda(){
        return "voce guardou a mascara";
    }

    //Pega a mascara de volta
    public String PegaM(){
        return "voce pegou a mascara";
    }
}
