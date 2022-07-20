package TPsValidationAcquis.tp4MatriceOccuPosition;

import java.util.ArrayList;
import java.util.List;
/**
Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
 La méthode devrait nous retourner la valeur correspond au nombre de fois que ce nombre se
 trouve dans le tableau et ses différentes positions.
        Ex :  maMethode({
        {1, 4, 2, 1},
        {6, 3, 8, 9},
        {1, 5, 1, 0}
        },1)
        > 1 se retrouve 4 fois dans les emplacements suivants : (0,0),(0,3),(2,0),(2,2)
*/



public class tp4MatricePositions {
    public static void main(String[] args) {
        int[][] tab ={
                {1,4,2,1},
                {6,3,8,9},
                {1,5,1,0}
        };
        System.out.println(nbrOccurrenceWithPositions(tab,1));
    }

    public static String nbrOccurrenceWithPositions(int[][] tab, int nombre){

        List<Integer> positionsHorizontal = new ArrayList<>();
        List<Integer> positionsVertical = new ArrayList<>();
        for(int i=0;i< tab.length;i++){
            for(int j=0;j< tab[i].length;j++){
                if(tab[i][j] == nombre){
                    positionsHorizontal.add(i);
                    positionsVertical.add(j);
                }
            }
        }

        StringBuffer sb =new StringBuffer();
        sb.append(String.format("%d se trouve %d fois dans les emplacement suivants:\n",nombre,positionsHorizontal.size()));
        for(int i=0;i<positionsHorizontal.size();i++){
            sb.append(String.format("(%d,%d),",positionsHorizontal.get(i),positionsVertical.get(i)));
        }

        return sb.toString();

    }




    // ancienne solution vu en exo de cours
    public static String afficherPositionNbr(int[][] tab, int nbr){
        int nbrOccurence = 0;
        String positions = "";
        for (int i=0; i< tab.length; i++){
            for (int j =0; j<tab[i].length; j++)
            {
                if(tab[i][j] == nbr){
                    nbrOccurence++;
                    positions += ("("+i+","+j+"),");
                }
            }
        }
        return (nbr + "se trouve "+nbrOccurence+" fois dans les emplacemets suivants:"+positions);
    }
}


