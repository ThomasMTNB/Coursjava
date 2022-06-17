package TPevalCours1a8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput;
        char letter;

        HashSet<Character> hashSetChar = new HashSet<>();
        HashMap<Character, Integer> hashMapDuplicates = new HashMap<>();


        System.out.printf("Enter sentence: ");
        userInput = input.nextLine();

        String copyOfUserInput = userInput;


//        a ==> hashset ? No --> Hashset(a)
//        b ==> hashset ? No --> Hashset(a, b)
//        c ==> hashset ? No --> Hashset(a, b, c)

//        a ==> hashset ? Yes --> Hashset(a, b, c)
//        b ==> hashset ? Yes --> Hashset(a, b, c)
//        c ==> hashset ? Yes --> Hashset(a, b, c)

        // Hasmap = {}


        for (int i = 0; i < userInput.length(); i++) {
            letter = userInput.charAt(i);

            if (hashSetChar.contains(letter)){

                // Verifie si il y a deja une valeur dans le HM. Si il y en a pas (null), mettre 1, sinon prendre la valeur existante

                // Le code commenté ci-dessous peut remplacer les 2 lignes de codes [int currentValueHM ... ]:
                // int currentValue = hashMapDuplicates.get(letter);
                // int toPut; // valeur a rentrer
                // if (currentValue == null){
                //       toPut = 1;
                //  } else
                //  {hashMapDuplicates.put(letter, currentValue + 1)
                //                }

                int currentValueHM = ( hashMapDuplicates.get(letter)==null ? 1 : hashMapDuplicates.get(letter) );
                hashMapDuplicates.put(letter, currentValueHM + 1);

                copyOfUserInput = copyOfUserInput.replaceAll(String.valueOf(letter), "");

            }
            hashSetChar.add(letter);
        }

        System.out.printf("Original sentence: [%s]\n", userInput);
        System.out.printf("Sentence after removal of duplicates: [%s]\n", copyOfUserInput);
        System.out.printf("List of duplicate values: [%s]\n", hashMapDuplicates);

        // Partie 2 - remove duplicate words


// Partie 2 - remove duplicate words

        String[] wordArray = userInput.split(" ");
        String duplicates = "";
        String sentenceWithoutDuplicates = "";


        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];

            if (sentenceWithoutDuplicates.contains(word)){
                duplicates = duplicates + " " + word;
            } else {
                sentenceWithoutDuplicates = duplicates + " " + word;
            }
        }

        sentenceWithoutDuplicates = sentenceWithoutDuplicates.trim();
        duplicates = duplicates.trim();

        System.out.printf("Initial sentence: %s\n", userInput);
        System.out.printf("List of duplicates: %s\n", duplicates);
        System.out.printf("Sentence without duplicates: %s\n", sentenceWithoutDuplicates);





    }
}
