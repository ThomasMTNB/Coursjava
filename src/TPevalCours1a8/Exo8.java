package TPevalCours1a8;

import java.util.Arrays;
import java.util.HashMap;

public class Exo8 {
    public static void main(String[] args) {

        String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println(Arrays.toString(finalPosition(directions)));

    }

    public static int[] finalPosition (String[] directions){

        HashMap<String, int[]> hashMapDirection = new HashMap<>();  // hashmap pour donner des coorder a chaque mots

        hashMapDirection.put("haut", new int[] {0, 1});
        hashMapDirection.put("bas", new int[] {0, -1});
        hashMapDirection.put("droite", new int[] {1,0});
        hashMapDirection.put("gauche", new int[] {-1,0});

        int positionX = 0;
        int positionY = 0;

        for (int i = 0; i < directions.length; i++) {
            positionX += hashMapDirection.get(directions[i])[0];  // position 0 dans la hash map (gain x)
            positionY += hashMapDirection.get(directions[i])[1]; // position 1 dans la hashmap (gain y)
        }

        int[] positionFinale = {positionX, positionY};

        return positionFinale;
    }
}
