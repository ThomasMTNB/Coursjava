package Cours3.TP;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exo15 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.println ("PIN =");
        var PIN = input.next();

        while (!input.equals(Pattern.matches("[0-9] {4}", PIN))) {
            System.out.println ("Pin invalide veuiller saisire des nombres\n");
            System.out.println ("PIN =");
        }


    }
}



// Pattern.matches ( "[0-9] {4}", nom))
// Character.isDigit(nom)

// ne marche paaaaas


 // Ajouter une validation de type de donnees pour que le code PIN saisi ne soit compose que des chiffres