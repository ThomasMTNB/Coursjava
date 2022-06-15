package Cours3;

import java.util.Scanner;

public class C3Bouclewhilepractice {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var codePIN="";
        System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
        while (true){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length() == 4){
                System.out.println("Code PIN defini avec succes");
                break;
            }
            System.out.println("Error : Le code PIN doit etre compose de 4 caracteres");
        }
//

        // DO WHILE
        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        String codeATester = "";
        while (true) {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester = input.nextLine();
            if(!codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil deverouille");
                break;
            }
            System.out.println("Code PIN errone.Veuillez recommencer");
        }

        int age=23;
        //On n'entre jamais dans la boucle parce qu'il le test qui s'execute en premier
        while (age<18){
            System.out.println("Inferieur -- while(condition){...}");
        }

        //La boucle va toujours s'executer au moins une fois meme si la condition n'est pas evaluee a VRAI
        do{
            System.out.println("Inferieur -- do{...}while(condition)");
        }while (age<18);


    }
}
