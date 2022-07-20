package TPsValidationAcquis.tp2_StringMaj;

import java.util.Scanner;
/**
Ecrire un programme Java qui demande à l’utilisateur de saisir une chaîne de caractères et va mettre en
 majuscule toutes les premières lettres de chaque mot.
 Ex :   Input : “je suis dans la joie”
        Resultat : Je Suis Dans La Joie
*/

public class Tp2StringMajBeginWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entrez une chaine de caractère: ");
        String chaine = input.nextLine();

        String[] tab = chaine.split("\\ "); // convertir string en tableau en se basant sur separateur espace
                                                    //pb: plusieur espace consecutif --> creer un chaine dans caine vide dans la table
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < tab.length; i++) {
            if (!tab[i].isEmpty()) {
                sb.append(Character.toUpperCase(tab[i].charAt(0)));
                if (tab[i].length() > 1) {
                    sb.append(tab[i].substring(1));
                }
                sb.append(" ");
            }
        }
        String newChaine = sb.toString().trim(); // supprimer les espace au début et à la fin

        System.out.printf("Input: %s\n", chaine);
        System.out.printf("Resultat: %s\n", newChaine);

    }
}







