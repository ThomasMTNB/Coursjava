package Cours3.TP;

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nombre ?");
        int n = input.nextInt();
        int fact = 1;

        for (int i=n;i>0;i=i-1) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}


// crivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre: