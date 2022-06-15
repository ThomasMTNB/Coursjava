package Cours2.TP;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("entrer nombre entier de 1 a 12");
        int monthid = input.nextInt();
        String monthresult;


        switch (monthid) {
            case 1:
                monthresult ="janvier";
            break;

            case 2:
                monthresult = "fevrier";
            break;

            case 3:
                monthresult = "mars";
            break;
        }




        /*

        if (monthid==1) {
            monthresult = "janvier";
        }
        else if (monthid==2) {
            monthresult = "fevrier";
        }
        else if (monthid==3) {
            monthresult = "mars";
        }
        else if (monthid==4) {
            monthresult = "avril";
        }
        else if (monthid==5) {
            monthresult = "mai";
        }
        else if (monthid==6) {
            monthresult = "juin";
        }
        else if (monthid==7) {
            monthresult = "juillet";
        }
        else if (monthid==8) {
            monthresult = "aout";
        }
        else if (monthid==9) {
            monthresult = "septembre";
        }
        else if (monthid==10) {
            monthresult = "octobre";
        }
        else if (monthid==11) {
            monthresult = "novembre";
        }
        else {
            monthresult = "decembre";
        }



        System.out.println(monthresult);
*/

    }
}




//Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
//
//Ex:
//Mois : 4
//Résult : Avril


/* Refaire avec   Switch (monthid) {
                        case 1:
                            monthresult = .....
                        break

*/