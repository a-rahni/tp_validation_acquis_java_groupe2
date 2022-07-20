package TPsValidationAcquis.tp5TabCaractereMajMin;

import java.util.Arrays;

/**
Écrire une méthode Java qui prend en paramètre un tableau de caractères.
 Et qui va ensuite retourner un nouveau tableau avec une alternance entre les lettres en Maj et Min.
 Ex :     maMethode(['a', 'b', 'c', 'd', 'e'])
                  > ['a', 'B', 'c', 'D', 'e']
*/

public class tp5TabCaractereMajMin {
    public static void main(String[] args) {
        Character[] charTab={'a','b','c','d','e'};
        System.out.println("tab: "+Arrays.toString(charTab));
        System.out.println("Resultat: "+Arrays.toString(alternanceMajMin(charTab)));

    }

    public static Character[] alternanceMajMin(Character[] tab){
        Character[] newTab= new Character[tab.length];
        for (int i=0;i<tab.length;i++){
            if(i%2 == 0) {
                newTab[i] = Character.toLowerCase(tab[i]);
            }else{
                newTab[i] = Character.toUpperCase(tab[i]);
            }
        }
        return newTab;
    }
}
