package Tp1;

import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println ("mots à tester :");
        String texte = input.nextLine();

        String reverse = "";


        for(int i=texte.length()-1;i>=0;i--){

            reverse = reverse + texte.charAt(i);
        }

        if (texte.equals(reverse)) {
            System.out.println ("votre mot est un palindrome");
        }
        else {
            System.out.println ("votre mot n'est pas un palindrome");
        }



    }
}
