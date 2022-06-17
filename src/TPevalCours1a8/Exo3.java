package TPevalCours1a8;

import java.util.HashMap;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        String str1;
        String str2;
        Scanner input = new Scanner(System.in);

        System.out.print("First word: ");
        str1 = input.nextLine().toUpperCase().replaceAll(" ", "");

        System.out.print("Second word: ");
        str2 = input.nextLine().toUpperCase().replaceAll(" ", "");

        // creation de 2 hashmap pour stocker les lettres

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        if (str1.length() == str2.length()) { // racourci pour ne pas tjr tout faire

// boucle For pour le stockage des Char des mots par occurence

            for (int i = 0; i < str1.length(); i++) {
                char lettre = str1.charAt(i);
                if (hashMap1.containsKey(lettre)) {
                    hashMap1.put(lettre, hashMap1.get(lettre) + 1);
                } else {
                    hashMap1.put(lettre, 1);
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                char lettre = str2.charAt(i);
                if (hashMap2.containsKey(lettre)) {
                    hashMap2.put(lettre, hashMap2.get(lettre) + 1);
                } else {
                    hashMap2.put(lettre, 1);
                }
            }


            if (hashMap1.toString().equals(hashMap2.toString())){
                System.out.println("Yes, an angramm !");
            } else {
                System.out.println("Not an anagramm.");
            }
        } else {
            System.out.println("Not an anagram.");
        }


    }
}
