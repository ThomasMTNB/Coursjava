package Cours3;

import java.util.Scanner;

public class C2bouclewhile {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var codePIN="";
        System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
        while (codePIN.length()!=4){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length()!=4){
                System.out.println("Error : Le code PIN doit etre compose de 4 caracteres");
            }else{
                System.out.println("Code PIN defini avec succes");
            }
        }

        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        String codeATester = "";
        while (!codeATester.equals(codePIN)) {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester = input.nextLine();
            if(codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil deverouille");
            }else{
                System.out.println("Code PIN errone.Veuillez recommencer");
            }
        }
/* AVEC BREAK OUT
        var input = new Scanner(System.in);
        var codePIN="";
        System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
        while (true){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length()!=4){
                System.out.println("Error : Le code PIN doit etre compose de 4 caracteres");
            }else{
                System.out.println("Code PIN defini avec succes");
                break;
            }
        }
//
        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        String codeATester = "";
        while (true) {   <---------- boucle infinie
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester = input.nextLine();
            if(!codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil deverouille");
                break;
            }else{
                System.out.println("Code PIN errone.Veuillez recommencer");
            }
        }


*/






       /* V1 var input=new Scanner(System.in);
        System.out.print("Veuillez definir un code PIN : ");
        var codePIN=input.nextInt();

        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        int codeATester=0;
        while (codeATester!=codePIN){//9999!=9999 => Faux
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester=input.nextInt();//9999
        } */






    }
}
