package Cours7_Inheritance;

public class MagicienClass extends PersonnageClass{

// commentaire = les zone inutille grace a la classe PersonnageClass

//    private String nom;
//    private int dureeDeVie;
    private String baguette;

    public MagicienClass(String nom, int dureeDeVie, String baguette) {
        super(nom,dureeDeVie);
        this.baguette = baguette;
    }


/*
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }
*/

    public String getBaguette() {
        return baguette;
    }

    public void setBaguette(String baguette) {
        this.baguette = baguette;
    }

    @Override
    public void rencontrer() {
        System.out.println("Attention, je suis un magicien");
    }


}
