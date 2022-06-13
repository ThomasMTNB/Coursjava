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


        /*





        for (int i=0;i<= maillist.size();i++) {
            String email = maillist.get(i);
            if (email.contains("@")) {
                int position = email.indexOf('@');
                if (email.substring(position,email.length()).equals("gmail.com")) {
                    gmail = gmail +1;
                }
                else if (email.substring(position,email.length()).equals("yahoo.fr")) {
                    yahoo = yahoo +1;
                }
                else if (email.substring(position,email.length()).equals("hotmail.fr")) {
                    hotmail = hotmail +1;
                }
            }
            else {
                System.out.println ("not an email");
            }

}
            */




        for (int i=0;i<= maillist.size();i++) {
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

