package TPevalCours1a8;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        double number;

        Scanner input = new Scanner(System.in);

        System.out.printf("Your number (int): ");
        number = input.nextInt(); // number is unput

        boolean isNegative = number < 0; // verif si neg ou non

        // convert to absolute value so the - won't be an issue // (Int) pour précision
        String stringToReverse = String.valueOf((int) Math.abs(number));

        String reversedString = "";
// reverse for

        for (int i = 0; i < stringToReverse.length(); i++) {
            reversedString = stringToReverse.charAt(i) + reversedString;
        }

        // pour reverse sans tenir comtpe du -
        if (isNegative) {
            System.out.println(-Integer.valueOf(reversedString));
        } else {
            System.out.println(Integer.valueOf(reversedString));
        }
    }
}
