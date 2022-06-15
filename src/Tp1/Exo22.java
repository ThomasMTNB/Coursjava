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
        // refaire avec check de suppr

/* var input=new Scanner(System.in);

    System.out.print("Combien de langages souhaitez-vous ajouter?");
    int nombreDeLangages=input.nextInt();

    input.nextLine();
    HashMap<String,String> langages=new HashMap<>();
    for(int i=1;i<=nombreDeLangages;i++){
       if(i==1){
           System.out.printf("Insérer le %der langage : ",i);
       }else{
           System.out.printf("Insérer le %dème langage : ",i);
       }
       String langage=input.nextLine();
       langages.put(langage,langage);
    }
    System.out.println(langages);

    System.out.println("Quel langage souhaitez-vous supprimer ? ");
    String langageASupprimer=input.nextLine();
    langages.remove(langageASupprimer);

    System.out.println("Après la suppression");
    System.out.println(langages);

    */

    }


}

// Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.
//
//Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.
//
//Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.



