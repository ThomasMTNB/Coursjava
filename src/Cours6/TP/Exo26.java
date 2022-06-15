package Cours6.TP;

import java.util.Scanner;

public class Exo26 {
    public static void main(String[] args) {
        PersonneClass entry1 = new PersonneClass();


        var input = new Scanner(System.in);
        System.out.println("enter firstname");
        entry1.setfirstname(input.nextLine());

        System.out.println("enter lastname");
        entry1.setlastname(input.nextLine());

        System.out.println("enter country");
        entry1.setcountry(input.nextLine());

        System.out.println("is married ? ");
        var yes = input.next().charAt(0);
        if (yes == 'y' ) {
            entry1.setmarried(true);
        }
        else {
            entry1.setmarried(false);
        }

        System.out.println("nb d'enfants ");
        entry1.setkid(input.nextByte());


        System.out.println (entry1.nomComplet());
        System.out.println (entry1.information());


    }

}



// crire une classe Personne qui est décrit par les données suivantes:
//firstName
//lastName
//pays
//married(booléen)
//nombreEnfants

/*
 Scanner input = new Scanner(System.in);

        Human human = new Human("Jack", "TheCat", "UK", false, 0);

        System.out.println(human.fullDescription());

        String tempInputStr;

        System.out.printf("First name: ");
        human.setFirstName(input.next());

        System.out.printf("Last name: ");
        human.setLastName(input.next());

        System.out.printf("Country: ");
        human.setCountry(input.next());

        System.out.printf("Are you married ? (y/n): ");
        tempInputStr = input.next();

        if (tempInputStr.equals("y")){
            human.setMarried(true);
        } else {
            human.setMarried(false);
        }

        System.out.printf("Number of kids: ");
        human.setNumberOfKids(input.nextInt());

        System.out.println("Your full name is: " + human.fullName());

        System.out.println("Full description: " + human.fullDescription());
 */