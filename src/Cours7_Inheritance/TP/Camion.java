package Cours7_Inheritance.TP;

public class Camion extends vehicule{
    private String modelCamion;

    public Camion(int matricule, int annee, float prix, String modelCamion) {
        super(matricule, annee, prix);
        this.modelCamion = modelCamion;
    }

    public String getModelCamion() {
        return modelCamion;
    }

    public void setModelCamion(String modelCamion) {
        this.modelCamion = modelCamion;
    }

    @Override
    public void demarrer() {
        System.out.println("le camion demarre lentement");
    }

    @Override
    public void accelerer() {
        System.out.println("le camion accelere lentement");
    }
}
