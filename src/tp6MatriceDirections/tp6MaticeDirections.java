package TPsValidationAcquis.tp6MatriceDirections;

import java.util.Arrays;
/**
On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite).
 Imaginez une personne debout sur une grille au point 0, 0. Pour chaque direction dans le tableau de chaînes,
 déplacez votre personne dans cette direction sur la grille. Retournez le point final X,Y où se trouve la personne
 sous la forme d'un tableau de deux entiers.
 Exigences
        Doit retourner un tableau de deux entiers
        Exemple:
        maMethode(["haut", "haut", "bas", "gauche", "gauche", "droite", "haut"])
        > [-2, -1] (pas [-1,2] erreur dans ennoncé)
*/
public class tp6MaticeDirections {
    public static void main(String[] args) {

        String[] tabDirection ={"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.printf("table direction: %s \n", Arrays.toString(tabDirection));
        System.out.printf("position finale: %s", Arrays.toString(trouverPositionFinale(tabDirection)));

    }

    public static int[] trouverPositionFinale(String[] tabDirections){
        // position initial
        int x = 0;
        int y = 0;
        for(String e:tabDirections){
            switch (e.toLowerCase())
            {
                case "haut":
                    x--;
                    break;
                case "bas":
                    x++;
                    break;
                case "gauche":
                    y--;
                    break;
                case "droite":
                    y++;
                    break;
            }
        }
        int[] positionFinale = {x,y};
        return positionFinale;

    }
}
