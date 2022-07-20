package TPsValidationAcquis.tp1_tableau;

import java.util.Arrays;
/**
Écrire un programme Java permet de déclarer un tableau d’entiers en Java, et qui ensuite va afficher le plus
 grand nombre, sa position; le plus petit nombre, et sa position.
 Dans l’affichage, il faut afficher le tableau en format [element1, element2,...,elementN], et dans l’affiche du
 plus grand nombre faire afficher le text(PG) et pour le plus petit(PP):
 Ex :
        Tb : [ 12,3,5,6,-3 ]
        Résultat:
        Tb : [12(PG) , 3, 5, 6, -3(PP)]
        Plus grand : 12
        Plus petit : -3
*/

public class TpTableauMinMaxPos {
    public static void main(String[] args) {
        int[] tab={12,3,5,6,-3};
        if(tab.length >0){
            int max=tab[0]; //Integer.MIN_VALUE;
            int min=tab[0]; //Integer.MAX_VALUE;
            int posMax=0; int posMin=0;
            for(int i=0; i< tab.length;i++){
                if(tab[i]>max){max =tab[i]; posMax =i;};
                if(tab[i]<min){min =tab[i]; posMin =i;};
            }

            // affichage
            System.out.println(Arrays.toString(tab));

            String s = "[";
            for(int i=0; i< tab.length;i++) {
                s += String.format("%d",tab[i]) + (i==posMax?"(PG)":"") + (i==posMin?"(PP)":"") +",";
                if (i==tab.length-1){
                    s= s.substring(0,s.length()-1)+"]";
                }
            }
            System.out.println(s);
            System.out.printf("Plus grand: %d\n",tab[posMax]);
            System.out.printf("Plus petit: %d\n",tab[posMin]);
        }
    }
}
