package Cours7_Inheritance.TP;

public class Exo28 {
    public static void main(String[] args) {


        Camion camion1 = new Camion(1,1999,20000,"VolvoTrucks");
        Camion camion2 = new Camion(2, 2004, 35000, "BenzTruck");
        Voiture voiture1= new Voiture(3,2003,12500,"renault");
        Voiture voiture2= new Voiture(4,2009,30000,"toyota");

        camion1.demarrer();
        camion1.accelerer();
        System.out.println(camion1);

        camion2.demarrer();
        camion2.accelerer();
        System.out.println(camion2);

        voiture1.demarrer();
        voiture1.accelerer();
        System.out.println(voiture1);

        voiture2.demarrer();
        voiture2.accelerer();
        System.out.println(voiture1);

        System.out.println(camion1.getModelCamion());

        camion1.setModelCamion("tranformers");

        System.out.println(camion1.getModelCamion());

    }
}




// Objectif:
//Créer une classe abstraite.
//Dériver une classe abstraite.
//Implémenter une méthode abstraite.
//Énoncé:
//Un parc auto se compose des voitures et des camions qui ont des caractéristiques communes regroupées dans la classe Véhicule.
//Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
//Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
//Tous les attributs de la classe véhicule sont supposés privés. ce qui oblige la création des accesseurs (get…) et des mutateurs (set….) ou les propriétés.
//La classe Véhicule possède également deux méthodes abstraites démarrer() et accélérer() qui seront définies dans les classes dérivées et qui affichent des messages personnalisés.
//La méthode ToString() de la classe Véhicule retourne une chaîne de caractères qui contient les valeurs du matricule, de l’année du modèle et du prix.
//Les classes Voiture et Camion étendent la classe Véhicule en définissant concrètement les méthodes accélérer() et démarrer() en affichant des messages personnalisés.
//Travail à faire:
//Créer la classe abstraite Véhicule.
//Créer les classes Camion et Voiture.
//Créer une classe Test  qui permet de tester la classe Voiture et la classe Camion