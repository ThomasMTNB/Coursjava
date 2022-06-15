package Cours3.TP;

import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.println ("email =");
        String email = input.nextLine();
        System.out.println ("motsdepass=");
        String mdp = input.nextLine();

        while (true) {
            System.out.println ("indiquer email :");
            String usermail = input.nextLine();
            System.out.println ("indiquer mdp :");
            String usermdp = input.nextLine();

            if (usermail.equals(email) && mdp.equals(usermdp)) {
                System.out.println ("vous etes connecté");
                break;
            }

            else if (!usermail.equals(email)) {
                System.out.println ("email incorrect");
            }
            else if (!usermdp.equals(mdp)) {
                System.out.println ("mdp incorrect");
            }


        }

    }
}


 //Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.
//
//Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:
//
//Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.
//
//Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.