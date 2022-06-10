package Tp1;

import java.util.Scanner;

public class Exo14 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.println ("email =");
        String email = input.nextLine();
        System.out.println ("motsdepass=");
        String mdp = input.nextLine();
        int essai = 0;
        boolean error=false;


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
                error = true;
            }
            else if (!usermdp.equals(mdp)) {
                System.out.println ("mdp incorrect");
                error = true;
            }
            if (error = true) {
                essai = essai+1;
                System.out.println ("il vous reste "+(5-essai)+" essais");
            }
            if (essai == 5) {
                System.out.println ("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué");
                break;
            }


        }

    }
}
