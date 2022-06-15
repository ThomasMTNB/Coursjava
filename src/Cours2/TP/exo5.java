package Cours2.TP;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("age?");
        int age = a.nextInt();

        int annee = 2022 - age;
        System.out.println(annee);

    }

}
