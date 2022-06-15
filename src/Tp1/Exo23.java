package Tp1;

import java.util.ArrayList;

public class Exo23 {
    public static void main(String[] args) {
        ArrayList<String> maillist=new ArrayList<>();


        maillist.add("christian.lisangola@gmail.com");
        maillist.add("jean.paul@gmail.com");
        maillist.add("alain@gmail.com");
        maillist.add("lydie@yahoo.fr");
        maillist.add("josephine.lajoie@yahoo.com");
        maillist.add("luise@hotmail.fr");
        maillist.add("philemon.turion@gmail.com");
        maillist.add("jules.cesar@hotmail.fr");


        var gmail = 0;
        var yahoo = 0;
        var hotmail = 0;


        for (int i=0;i<=maillist.size()-1;i++) {
            String email = maillist.get(i);
            String domaine = email.substring(email.indexOf('@'));
            if (domaine.equals("gmail.com")) {
                gmail = gmail +1;
            }
            else if (domaine.equals("yahoo.com") || domaine.equals("yahoo.fr")) {
                yahoo = yahoo +1;
            }
            else if (domaine.equals("hotmail.fr")) {
                hotmail = hotmail +1;
            }

        }

        float Tgmail = ((gmail*100)/8);
        float Tyahoo = ((yahoo*100)/8);
        float Thotmail = ((hotmail*100)/8);

        System.out.println("proportion des domaines : " + Tgmail + "%, " + Tyahoo+ "%, " + Thotmail + "%");


    }
}

// refaire %%%
// refaire avec Hashmap
// refaire avec .contain "domain"



// Ecrire un programme Java qui remplit un tableau avec une liste des adresse email : christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr, josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr
//
//Ensuite le programme va afficher en % le taux d'adresse gmail, yahoo et hotmail.
//
//Essayer de le résoudre au plus, et essayer approche basé sur le HMap.