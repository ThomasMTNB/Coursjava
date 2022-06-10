package Tp1;

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
