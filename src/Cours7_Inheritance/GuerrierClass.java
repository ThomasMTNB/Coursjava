package Cours7_Inheritance;

public class GuerrierClass extends PersonnageClass{

// commentaire = les zone inutille grace a la classe PersonnageClass


//    private String nom;
//    private int dureeDeVie;
    private String arme;




    public GuerrierClass(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
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

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un guerrier,et je vais te tuer");
    }


}
