package Tp1;

import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println ("taille tableau  :");
        var taille1 = input.nextInt();

        float[] tableau=new float[taille1];

        for(int i=0;i<=tableau.length-1;i++){
            System.out.printf("inser[%d] : ",i);
            tableau[i]=input.nextFloat();
        }

        System.out.println ("recherche :");
        var search = input.nextInt();
        boolean searchtrue = false;
        int multiple = 0;


        for (int i=0;i<=tableau.length-1;i++) {
            if (search == tableau[i]) {
                searchtrue = true;
            }
            else {
                searchtrue = false;
            }
        }

        if (searchtrue == true) {
            System.out.println("votre recherche est present dans la table");
            for (int i=0;i<=tableau.length-1;i++) {
                if (search == tableau[i]) {
                    multiple = multiple +1;
                }
            }
            System.out.println("votre recherche est present "+ multiple + " fois");

        }
        else {
            System.out.println("votre recherche n'est pas present dans la table");
        }










    }
}
