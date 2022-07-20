package TPsValidationAcquis.tp8CaractereIdentique;

import java.util.Scanner;

/**
Recherche de caractères identiques dans une rangée
 On vous donne une chaîne de caractères d'un seul mot comme argument. Vous retournerez true si elle contient deux
 caractères identiques dans une rangée,c’est-à-dire qui se suivent, sinon elle retournera false.
 Exigences
        Doit retourner true ou false
        Doit également fonctionner avec les caractères spéciaux
 Exemple n° 1   maMethode("terrific")   > true
 Exemple n°2    maMethode("chats")      > false
 Exemple n°3    maMethode("chats!!")   > true
*/

public class tp8CaractereIdentique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entrez un mot avec ou sans caractère spéciaux: ");
        String mot=input.next();
        boolean caractereIdentique = false;
        for(int i=0;i<mot.length()-1;i++){
            if(mot.charAt(i) == mot.charAt(i+1)){
                caractereIdentique = true;
                break;
            }
        }

        System.out.println( "ce mot contient au moins deux caractère identiques?: "+ caractereIdentique);
    }
}
