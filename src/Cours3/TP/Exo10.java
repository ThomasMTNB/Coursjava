package Cours3.TP;

import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {

        for (int j=2;j<=10;j=j+1){
            int table = j;
            System.out.println ("\ntable de "+table+"\n");
            for(int i=1;i<=10;i=i+1){
                System.out.println(table+"x"+i+"="+(table*i));
                System.out.printf("%d  %d %d" , table,i,(table*i));
            }
        }

// faire avec printf

// Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
//Votre programme devra produire la sortie suivante à l'écran :

    }


}
