package Cours1.TP;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("valeur du diametre ?");
        int diametre = a.nextInt();
        float rayon = (diametre/2);
        float surface = (rayon*rayon*3.14F);
        System.out.println(surface);
    }
}

