package Cours7_Inheritance;

public class SorcierClass extends MagicienClass{

    // commentaire = les zone inutille grace a la classe PersonnageClass

//    private String nom;
//    private int dureeDeVie;

    private String batonMagique;

    public SorcierClass(String nom, int dureeDeVie, String baguette,String batonMagique) {
        super(nom,dureeDeVie,baguette);
        this.batonMagique=batonMagique;
    }

/*
    public String getNom() {
        return nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }
*/


    public String getBatonMagique() {
        return batonMagique;
    }


//    public void setNom(String nom) {
//        this.nom = nom;
//    }

//    public void setDureeDeVie(int dureeDeVie) {
//        this.dureeDeVie = dureeDeVie;
//    }



    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer() {
        System.out.println("Attentions, je suis un sorcier");
    }


}
