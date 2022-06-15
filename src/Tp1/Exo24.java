package Tp1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exo24 {
    public static void main(String[] args) {
        Integer[] idJours = {1,2,3,4,5,6,7};
        String[] Jours ={"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};

        var input = new Scanner(System.in);

     // hashmap link with position simple
        HashMap<Integer,String> rang=new HashMap<>();
        for (int i=0;i<=6;i++) {
            rang.put(idJours[i],Jours[i]);
        }

        System.out.println (rang.get(3));

        System.out.println ("\ntaper numéro :");
        int search= input.nextInt();

        for (int i=0;i<=6;i++) {
            if (search==idJours[i]) {
                System.out.println(Jours[i]);
            }

        }







    // hashmap link with content




    }
}



/// refaire exo : demandé utilisateur d'ajoute un Nombre INT, qui sera associé a un jours STRING choisis par utilisateur
/// crea 2 boucle scanner pour remplire 2 tableau fixe
// nom.indexOf('a')


// Ecrire un programme Java qui permet à l'utilsation de déclarer 2 tableaux:
//1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)
//1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
//Associer les 2 informations dans un HashMap
//Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au jour et le jour de la semaine correspondant.
//
//Pour les jours de la semaine et le numéros correspondant, veuillez stocker les données dans des Set(recherche sur internet)