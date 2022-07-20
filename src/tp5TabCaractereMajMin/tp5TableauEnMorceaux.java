package TPsValidationAcquis.tp5TabCaractereMajMin;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Arrays;

public class tp5TableauEnMorceaux {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {1,2,3,4,5};
        int[] tab3 = {1,2,3,4,5,6,7,8};
        int[] tab4 = {1,2,3,4,5};
        int[] tab5 = {1,2,3,4,5};

        System.out.printf("(%s,%d)-->[",Arrays.toString(tab1),2);
        int[][] newTab1 = diviserEnMorceaux(tab1,2);
        for(int[] mourceau:newTab1){
            System.out.printf("%s,",Arrays.toString(mourceau));
        }
        System.out.printf("]\n");


        System.out.printf("(%s,%d)-->[",Arrays.toString(tab2),2);
        int[][] newTab2 = diviserEnMorceaux(tab2,2);
        for(int[] mourceau:newTab2){
            System.out.printf("%s,",Arrays.toString(mourceau));
        }
        System.out.printf("]\n");
        /** TO DO: retravailler l'affichage du dernier morceau en cas où il est incomplet*/



    }

    public static int[][] diviserEnMorceaux(int[] tab, int tailleMorceau){
//        if (tab.length%tailleMorceau !=0 ){
//            System.out.println( "la taille mourceau doit être un diviseur de la taille du Tableau");
//            return null;
//        }
        int nbrMorceaux = (tab.length%tailleMorceau == 0? tab.length/tailleMorceau:tab.length/tailleMorceau+1);
        int[][] newTab = new int[nbrMorceaux][tailleMorceau];
        int i=0; int indexMorceau =0;
        while ((i< tab.length) /*&& (i+tailleMorceau< tab.length)*/){
            //newTab[indexMorceau] = Arrays.copyOf((int[])tab[i],tailleMorceau);
            int tailleCopie = tailleMorceau;
            if(indexMorceau == nbrMorceaux-1){
                tailleCopie = (tab.length%tailleMorceau == 0? tailleMorceau:tab.length%tailleMorceau);
            }
            System.arraycopy(tab,i,newTab[indexMorceau],0,tailleCopie);
            indexMorceau++;
            i+=tailleMorceau;
        }
        return newTab;
    }
}
