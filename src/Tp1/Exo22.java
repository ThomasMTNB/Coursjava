package Tp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        ArrayList<String> Matrice=new ArrayList<>();
        var input = new Scanner(System.in);




        while (true) {
            System.out.println("Set langages to add, type 'Exit' to stop :");
            String langage = input.nextLine();


            if (langage.equals("Exit")) {
                break;
            }
            Matrice.add(langage);
        }

        System.out.println(Matrice);

        while (true) {
            System.out.println("Set langages to remove, type 'Exit' to stop :");
            String delete = input.nextLine();

            if (delete.equals("Exit")) {
                break;
            }
            Matrice.remove(delete);


        }

        System.out.println(Matrice);

        // matrice.contain pour check avant action



    }


}
