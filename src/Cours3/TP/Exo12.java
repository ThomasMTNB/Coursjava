package Cours3.TP;

import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nombre ?");
        int n = input.nextInt()+1;

        for (int i=n;i<(n+10);i=i+1){
            System.out.println(i);
        }

    }
}

//crire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.