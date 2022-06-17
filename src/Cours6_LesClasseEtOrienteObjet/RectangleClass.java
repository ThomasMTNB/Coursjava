package Cours6_LesClasseEtOrienteObjet;

    class RectangleClass {
        double longueur;
        double largeur;

        double calculDeLaSurface(){
            return longueur*largeur;
        }

        double calculDuPerimetre(){
            return 2*(longueur+largeur);
        }
    }



// 1 fichier = 1 classe

