package Cours4.TP;

import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);


        int[][] matrice=new int[4][4];

        for(int i=0;i<matrice.length;i++){
            for (int j=0; j<matrice[i].length;j++) {
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }

        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();   // permet affichage tableau
        }

        int Diag = 0;

        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                if (i==j) {
                    Diag = Diag + matrice[i][j];
                }
            }
        }

        System.out.println("la somme de la diagonale est " + Diag);






    }

}

// Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale

