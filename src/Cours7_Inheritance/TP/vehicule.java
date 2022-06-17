package Cours7_Inheritance.TP;

public abstract class vehicule {

    private int incr = 0;
    private int matricule;
    private int annee;
    private float prix;


// enelver matricule du constructeur et SET pour incr

    public vehicule(int matricule, int annee, float prix) {
        this.incr=this.incr +1;
        this.matricule=this.incr;
        this.annee = annee;
        this.prix = prix;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }


    public void demarrer() {
    }

    public void accelerer() {
    }

    @Override
    public String toString() {
        return "vehicule{" +
                "matricule='" + matricule + '\'' +
                ", annee=" + annee +
                ", prix=" + prix +
                '}';
    }
}
