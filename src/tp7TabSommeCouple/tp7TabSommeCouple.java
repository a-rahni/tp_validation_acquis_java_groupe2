package TPsValidationAcquis.tp7TabSommeCouple;

import java.util.Arrays;

public class tp7TabSommeCouple {
    public static void main(String[] args) {

        //int[] tab={2,7,11,15};
        //int sum = 9;
        int[] tab={3,2,4,7,5,-1};
        int sum = 6;
        int[][] couplesIndex= couplesAvecSomme(tab,sum);
        System.out.println(Arrays.toString(tab));
        System.out.printf("couples avec sum %d: [", sum);
        for(int[] e:couplesIndex) {
            System.out.printf(" %s", Arrays.toString(e));
        }
        System.out.printf("]\n");

    }

    public static int[][] couplesAvecSomme(int[] tab, int sum){
        // un element est utilisé une fois donc nombre de couples possible taille/2
        int[][] couples = new int[tab.length/2][2];
        int indexCouple=0;
        int[] indexOfUsedElement= new int[tab.length];
        int indexUsedElement = 0;
        for(int i=0;i<tab.length-1;i++){
            if(Arrays.binarySearch(indexOfUsedElement,i)<0) {
                for (int j = i+1; j < tab.length; j++) {
                    if (tab[i] + tab[j] == sum) {
                        if (Arrays.binarySearch(indexOfUsedElement, j) < 0) {
                            couples[indexCouple][0] = tab[i];// i;
                            couples[indexCouple][1] = tab[j]; //j;
                            indexOfUsedElement[indexUsedElement++] = i;
                            //indexUsedElement++;
                            indexOfUsedElement[indexUsedElement++] = i;
                            //indexUsedElement++;
                            indexCouple++;
                        }
                    }
                }
            }
        }

        if(indexCouple == 0){
            return null;
        }
        int[][] couplesResult = new int[indexCouple][2];
        for(int i=0;i<indexCouple;i++){
            couplesResult[i][0]= couples[i][0];
            couplesResult[i][1]= couples[i][1];
        }
        return couplesResult;
    }
}
