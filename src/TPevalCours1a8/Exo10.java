package TPevalCours1a8;

public class Exo10 {

        public static void main(String[] args) {
//
//        System.out.println("Il te reste " + (this.solde - montant) + " EUR dans ta tirelire.");

            Tirelire vache = new Tirelire(100);

            System.out.println(vache.afficher());
            vache.puiser(10);

            System.out.println(vache.afficher());
            vache.remplir(20);

            System.out.println(vache.afficher());
            vache.secouer();

            System.out.println(vache.afficher());
            System.out.println(vache.calculerSolde(256));

            System.out.println(vache.afficher());
            vache.calculerSolde(28);

            System.out.println(vache.afficher());



        }
    }
