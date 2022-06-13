package Tp1;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println ("mots à tester :");
        String texte = input.nextLine();

        var reverse = "";



        for(int i=texte.length()-1;i>=0;i--){
            reverse = reverse + texte.charAt(i);
        }

        System.out.println(reverse);

    }
}
