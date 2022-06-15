package Cours2.TP;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nom ?");
        String nom = a.next();


        System.out.println("prenom ?");
        String prenom = a.next();


        System.out.println("age ?");
        byte age = a.nextByte();
        System.out.println("vous vous appelez "+prenom+" "+nom+" et vous avez "+age+" ans");

    }
}
