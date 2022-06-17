package Cours7_Inheritance.TP;

public class Voiture extends vehicule{

    private String modelVoiture;

    public Voiture(int matricule, int annee, float prix, String modelVoiture) {
        super(matricule, annee, prix);
        this.modelVoiture = modelVoiture;
    }


    public String getModelVoiture() {
        return modelVoiture;
    }

    public void setModelVoiture(String modelVoiture) {
        this.modelVoiture = modelVoiture;
    }

    @Override
    public void demarrer() {
        System.out.println("la voiture demarre vite");
    }

    @Override
    public void accelerer() {
        System.out.println("la voiture accelere vite");
    }

}
